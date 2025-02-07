package com.example.springsecurity.repository;

import com.example.springsecurity.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByEmail(String email);

}
