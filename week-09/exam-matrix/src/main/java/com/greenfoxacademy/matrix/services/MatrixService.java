package com.greenfoxacademy.matrix.services;

import com.greenfoxacademy.matrix.modells.Matrix;

import java.util.List;

public interface MatrixService {
  Matrix createMatrix(String numberString);
  Boolean validateMatrix(String numberString);
  void saveMatrix(Matrix matrix);
  List<Matrix> showMatrices();
}
