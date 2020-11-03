package com.jimmy.springmvc.product.dao;

import com.jimmy.springmvc.product.entity.User;

import java.util.List;

public interface UserDAO {
    public int save(User u);

    public List<User> findAll();


}
