package com.greenfoxacademy.rest.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ArrayHandlerServiceImpl implements ArrayHandlerService {
  Object result;

  public ArrayHandlerServiceImpl(Object result) {
    this.result = result;
  }

  public ArrayHandlerServiceImpl() {
  }

  @Override
  public Integer sumOfElements(List<Integer> numbers) {
    Integer sum = 0;
    for (int i = 0; i < numbers.size(); i++) {
      sum += numbers.get(i);
    }

    result = Integer.valueOf(sum);
    return (Integer) result;
  }

  @Override
  public Integer multiplicationOfElements(List<Integer> numbers) {
    Integer multiplication = 1;
    for (int i = 0; i < numbers.size(); i++) {
      multiplication *= numbers.get(i);
    }

    result = Integer.valueOf(multiplication);
    return (Integer) result;
  }

  @Override
  public List<Integer> doubleOfElements(List<Integer> numbers) {
    List<Integer> doubledNumbers = new ArrayList<>();
    for (int i = 0; i < numbers.size(); i++) {
      doubledNumbers.add(numbers.get(i) * 2);
    }

    result = Arrays.asList(doubledNumbers);
    return (List<Integer>) result;
  }
}
