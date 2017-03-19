package com.learn.validator.validation;

import com.learn.validator.CSV.Row;

public class AllTypeValidator implements Validator<Row> {
  public boolean validate(Row content) {
    int index = 0;
    for(ValidatorMap validatorMap: ValidatorMap.values()) {
      if(!validatorMap.equals(ValidatorMap.STRING)) {
        Validator validator = validatorMap.getValidator();
        String value = content.getRowContent()[index];
        if(!validator.validate(value)) {
          return false;
        }
      }
      index += 1;
    }
    return true;
  }
}
