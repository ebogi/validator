package com.learn.validator.validation;

public class IntegerValidator implements Validator<String> {
  public boolean validate(String content){
    return content.matches("[-+]?[0-9]*\\.?[0-9]+");
  }
}
