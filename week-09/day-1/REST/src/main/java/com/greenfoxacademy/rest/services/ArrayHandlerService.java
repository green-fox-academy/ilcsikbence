package com.greenfoxacademy.rest.services;

import java.util.List;

public interface ArrayHandlerService {
  Integer sumOfElements(List<Integer> numbers);
  Integer multiplicationOfElements(List<Integer> numbers);
  List<Integer> doubleOfElements(List<Integer> numbers);
}
