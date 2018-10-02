package com.greenfoxacademy.matrix.services;

import com.greenfoxacademy.matrix.modells.Matrix;
import com.greenfoxacademy.matrix.repositories.MatrixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatrixServiceImpl implements MatrixService {
  MatrixRepository matrixRepository;

  @Autowired
  public MatrixServiceImpl(MatrixRepository matrixRepository) {
    this.matrixRepository = matrixRepository;
  }

  @Override
  public Matrix createMatrix(String numberString) {
    String[] lines = numberString.split("\\r?\\n");

    String[][] stringMatrix = new String[lines.length][lines.length];
    splitToStringMatrix(lines, stringMatrix);

    int[][] matrix = new int[lines.length][lines.length];
    parseToIntMatrix(stringMatrix, matrix);

    return new Matrix(matrix);
  }

  @Override
  public Boolean validateMatrix(String numberString) {
    String[] lines = numberString.split("\\r?\\n");

    for (int i = 0; i < lines.length; i++) {
      if (lines[i].length() != lines.length + (lines.length - 1))
        return false;
    }

    String[][] stringMatrix = new String[lines.length][lines.length];
    splitToStringMatrix(lines, stringMatrix);

    int[][] matrix = new int[lines.length][lines.length];
    parseToIntMatrix(stringMatrix, matrix);

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i].length != matrix.length)
          return false;
      }
    }

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length - 1; j++) {
        if (matrix[i][j] >= matrix[i][j + 1])
          return false;
      }
    }

    for (int i = 0; i < matrix.length - 1; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if (matrix[i][j] >= matrix[i + 1][j])
          return false;
      }
    }

    return true;

  }

  public void splitToStringMatrix(String[] lines, String[][] stringMatrix) {
    for (int i = 0; i < lines.length; i++) {
      for (int j = 0; j < lines.length; j++) {
        stringMatrix[i][j] = lines[i].split(" ")[j];
      }
    }
  }

  public void parseToIntMatrix(String[][] stringMatrix, int[][] matrix) {
    for (int i = 0; i < stringMatrix.length; i++) {
      for (int j = 0; j < stringMatrix.length; j++) {
        matrix[i][j] = Integer.parseInt(stringMatrix[i][j]);
      }
    }
  }

  @Override
  public void saveMatrix(Matrix matrix) {
    matrixRepository.save(matrix);
  }

  @Override
  public List<Matrix> showMatrices() {
    return matrixRepository.findAll();
  }
}
