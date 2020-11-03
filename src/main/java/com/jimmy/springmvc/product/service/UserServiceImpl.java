package com.jimmy.springmvc.product.service;

import com.jimmy.springmvc.product.dao.UserDAO;
import com.jimmy.springmvc.product.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    public void saveUser(User u) {
        userDAO.save(u);
    }

    public void saveUsers(List<User> us) {
        for(User u : us) {
            userDAO.save(u);
        }
    }

    public List<User> getAllUsernames() {
//        List<String> users = new ArrayList<String>();
//        users.add("Mark");
//        users.add("Ken");
//        users.add("Fowafolo");
        return userDAO.findAll();
    }
}
