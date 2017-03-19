package com.learn.validator.CSV;

public class Row {
  private int rowNumber;
  private String[] rowContent;
  private int numberOfColumnsInRow;

  private void setRowNumber(int rowNumber) {
    this.rowNumber = rowNumber;
  }

  private void setRowContent(String[] rowContent) {
    this.rowContent = rowContent;
  }

  private void setNumberOfColumnsInRow() {
    this.numberOfColumnsInRow = rowContent.length;
  }

  public int getRowNumber() {
    return rowNumber;
  }

  public String[] getRowContent() {
    return rowContent;
  }

  public int getNumberOfColumnsInRow() {
    return numberOfColumnsInRow;
  }

  public Row(int rowNumber, String[] rowContent) {
    setRowNumber(rowNumber);
    setRowContent(rowContent);
    setNumberOfColumnsInRow();
  }


}
