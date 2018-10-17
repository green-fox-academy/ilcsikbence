package com.greenfoxacademy.googleapi.repository;

import com.greenfoxacademy.googleapi.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
