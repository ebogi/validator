package com.learn.validator.validation;

public interface Validator<T> {
  boolean validate(T content);
}
