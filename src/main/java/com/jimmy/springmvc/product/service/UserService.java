package com.jimmy.springmvc.product.service;

import com.jimmy.springmvc.product.entity.User;

import java.util.List;

public interface UserService {
    public void saveUser(User u);

    public void saveUsers(List<User> us);

    public List<User> getAllUsernames();
}
