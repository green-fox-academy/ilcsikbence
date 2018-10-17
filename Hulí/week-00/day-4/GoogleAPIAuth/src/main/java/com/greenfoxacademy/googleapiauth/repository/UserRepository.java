package com.greenfoxacademy.googleapiauth.repository;

import com.greenfoxacademy.googleapiauth.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
