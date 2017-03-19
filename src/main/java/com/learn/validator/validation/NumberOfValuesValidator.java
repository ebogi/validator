package com.learn.validator.validation;

import com.learn.validator.CSV.Row;
import com.learn.validator.CSV.Schema;

public class NumberOfValuesValidator implements Validator<Row> {

  private Schema schema;

  public NumberOfValuesValidator(Schema schema) {
    this.schema = schema;
  }

  public boolean validate(Row content) {
    return content.getNumberOfColumnsInRow() == schema.getNumberOfColumnsInARow();
  }

}