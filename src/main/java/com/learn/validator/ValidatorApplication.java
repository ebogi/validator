package com.learn.validator;


import com.learn.validator.CSV.Row;
import com.learn.validator.CSV.Schema;
import com.learn.validator.validation.AllTypeValidator;
import com.learn.validator.validation.NumberOfValuesValidator;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ValidatorApplication {

  private String filePath = null;
  private Schema schema = null;

  public ValidatorApplication() throws IOException {
    this.filePath = "/Users/boglarka.egyed/learn/validator/src/test/resources/test.csv";
    // TODO: access resources folder instead of full filepath usage
    this.schema = new Schema();
  }

  public static void main(String[] args) {
    try {
      ValidatorApplication validatorApplication = new ValidatorApplication();

      if(validatorApplication.parseAndValidateFile()) {
        System.out.println("SUCCES: Valid input file!");
      } else{
        System.out.println("FAILURE: Invalid input file!");
      }
    } catch(Exception exception) {
      System.out.println(exception.toString());
    }
  }

  private boolean parseAndValidateFile() throws Exception {
    Scanner scanner = new Scanner(new File(filePath));
    int rowNumber = 0;
    NumberOfValuesValidator numberOfValuesValidator = new NumberOfValuesValidator(schema);
    AllTypeValidator allTypeValidator = new AllTypeValidator();

    while(scanner.hasNextLine()){
      rowNumber += 1;
      String currentLine = scanner.nextLine();
      String[] values = currentLine.split(schema.getSeparator());
      Row currentRow = new Row(rowNumber, values);
      if(!numberOfValuesValidator.validate(currentRow)) {
        return false;
      }
      if(!allTypeValidator.validate(currentRow)) {
        return false;
      }
    }
    scanner.close();
    return true;
  }

}
