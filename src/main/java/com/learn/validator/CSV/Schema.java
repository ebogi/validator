package com.learn.validator.CSV;

import org.ini4j.Ini;
import org.ini4j.Profile;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;

public class Schema {

  private String separator = null;
  private int numberOfColumnsInARow = -1;
  private String[] types = null;

  public void setSeparator(String separator) {
    this.separator = separator;
  }

  public void setNumberOfColumnsInARow(int numberOfColumnsInARow) {
    this.numberOfColumnsInARow = numberOfColumnsInARow;
  }

  public void setTypes(String[] types) {
    this.types = types;
  }

  public String getSeparator() {

    return separator;
  }

  public int getNumberOfColumnsInARow() {
    return numberOfColumnsInARow;
  }

  public String[] getTypes() {
    return types;
  }

  public Schema(String fileName) throws IOException {
    ClassLoader classLoader = getClass().getClassLoader();
    File file = new File(classLoader.getResource(fileName).getFile());
    Ini ini = new Ini(file);
    Profile.Section schema = ini.get("schema");

    setSeparator(schema.get("separator"));
    setNumberOfColumnsInARow(Integer.parseInt(schema.get("numberOfColumnsInARow")));
    setTypes(schema.get("types").split(","));
  }

  public boolean isValidSchema() {
    return getNumberOfColumnsInARow() == Array.getLength(getTypes());
  }
}
