package com.learn.validator.CSV;

import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.assertEquals;

public class TestRow {

  @Test
  public void testNumberOfColumns() {
    final int TEST_ROW_NUMBER = 1;
    final String[] TEST_ROW_CONTENT = {"testCol1", "testCol2", "testCol3"};
    final int TEST_ROW_CONTENT_LENGTH = Array.getLength(TEST_ROW_CONTENT);
    Row testRow = new Row(TEST_ROW_NUMBER, TEST_ROW_CONTENT);

    assertEquals(testRow.getNumberOfColumnsInRow(), TEST_ROW_CONTENT_LENGTH);
  }
}
