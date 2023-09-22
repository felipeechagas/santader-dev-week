package com.codever.service;

import com.codever.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
