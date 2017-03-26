package com.learn.validator.CSV;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TestSchema {

  @Test
  public void testSchemaParser() throws IOException {
    final String TEST_SEPARATOR = "*";
    final int TEST_NUMBER_OF_COLUMNS_IN_A_ROW = 10;
    final String[] TEST_TYPES = {"testType1", "testType2", "testType3"};
    final String TEST_INI_FILE_NAME = "test_schema.ini";
    Schema testSchema = new Schema(TEST_INI_FILE_NAME);

    assertEquals(TEST_SEPARATOR, testSchema.getSeparator());
    assertEquals(TEST_NUMBER_OF_COLUMNS_IN_A_ROW, testSchema.getNumberOfColumnsInARow());
    assertEquals(TEST_TYPES, testSchema.getTypes());
  }

  @Test
  public void testInvalidSchemaFile() throws IOException{
    final String TEST_INI_FILE_NAME = "test_schema.ini";
    Schema testSchema = new Schema(TEST_INI_FILE_NAME);

    assertFalse(testSchema.isValidSchema());
  }
}
