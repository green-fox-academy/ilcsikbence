package com.greenfoxacademy.matrix.repositories;

import com.greenfoxacademy.matrix.modells.Matrix;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatrixRepository extends CrudRepository<Matrix, Long> {
  List<Matrix> findAll();
}