package com.learn.validator.validation;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateValidator implements Validator<String> {

  public boolean validate(String content) {
    final String DATE_FORMAT = "dd-MM-yyyy";
    try {
      DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
      dateFormat.setLenient(false);
      dateFormat.parse(content);
      return true;
    } catch (ParseException e) {
      return false;
    }
  }

}
