package com.codever.service;

import com.codever.model.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

    List<User> findAll();
}
