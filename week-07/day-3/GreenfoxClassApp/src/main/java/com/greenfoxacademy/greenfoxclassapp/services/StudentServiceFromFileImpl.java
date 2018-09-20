package com.greenfoxacademy.greenfoxclassapp.services;

import com.greenfoxacademy.greenfoxclassapp.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Primary
@Service
public class StudentServiceFromFileImpl implements StudentService {
  StudentRepository studentRepository;

  @Autowired
  public StudentServiceFromFileImpl(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  @Override
  public void save(String student) {
    studentRepository.getStudentLines().add(student);
  }

  @Override
  public List<String> findAll() {
    return studentRepository.getStudentLines();
  }

  @Override
  public int count() {
    return studentRepository.getStudentLines().size();
  }

  @Override
  public String isExisting(String student) {
    if (studentRepository.getStudentLines().contains(student)) {
      return student + " exists in database";
    } else {
      return student + " does not exist in database";
    }
  }
}
