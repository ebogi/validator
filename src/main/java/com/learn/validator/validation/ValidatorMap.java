package com.learn.validator.validation;

public enum ValidatorMap {
  INTEGER(new IntegerValidator()),
  STRING(null),
  DATE(new DateValidator());

  private final Validator validator;

  public Validator getValidator() {
    return validator;
  }

  ValidatorMap(Validator validator) {
    this.validator = validator;
  }

}
