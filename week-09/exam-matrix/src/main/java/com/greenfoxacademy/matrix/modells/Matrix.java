package com.greenfoxacademy.matrix.modells;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Matrix {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private int[][] matrixNumbers;
  private Date date;

  public Matrix(int[][] matrixNumbers) {
    this.matrixNumbers = matrixNumbers;
    this.date = new Date();
  }

  public Matrix() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int[][] getMatrixNumbers() {
    return matrixNumbers;
  }

  public void setMatrixNumbers(int[][] matrixNumbers) {
    this.matrixNumbers = matrixNumbers;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }
}