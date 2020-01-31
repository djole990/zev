package com.djole.zev.services;

import com.djole.zev.models.User;

import java.util.List;

public interface UserService {

    User getUserById(Long id);

    List<User> getAllUsers();

    User saveUser(User user);
}
