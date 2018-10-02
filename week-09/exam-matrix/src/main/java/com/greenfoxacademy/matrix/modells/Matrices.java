package com.greenfoxacademy.matrix.modells;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.List;

public class Matrices {
  @OneToMany(cascade = CascadeType.ALL)
  private List<Matrix> matrices;

  public Matrices(List<Matrix> matrices) {
    this.matrices = matrices;
  }

  public Matrices() {
  }

  public List<Matrix> getMatrices() {
    return matrices;
  }

  public void setMatrices(List<Matrix> matrices) {
    this.matrices = matrices;
  }
}