package com.jimmy.springmvc.product.controller;

import com.jimmy.springmvc.product.entity.Product;
import com.jimmy.springmvc.product.entity.User;
import com.jimmy.springmvc.product.service.ProductService;
import com.jimmy.springmvc.product.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class MainController {

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

    @RequestMapping(value="",method = RequestMethod.GET)
    @ResponseBody
//    public String index() {
//        return "index";
//    }
    public String home(){
//        List<User> us = new ArrayList<User>();
//        User u = new User();
//        u.setId(2);
//        u.setUsername("Kim");
//        us.add(u);
//        u = new User();
//        u.setId(3);
//        u.setUsername("Fawofolo");
//        us.add(u);
//        userService.saveUsers(us);
//        System.out.println("Successfully");
        return "index";
    }

    @RequestMapping(value="/json",method = RequestMethod.GET)
    @ResponseBody
//    public Map<String,String> json() {
//        Map<String,String> result = new HashMap<String, String>();
//        result.put("Mark","hello");
//        result.put("Ken","Hehe");
//        result.put("Fowafolo","fool");
//        return result;
//    }
    public List<User> json() {
        return userService.getAllUsernames();
    }

    @GetMapping("/getusers")
    public ResponseEntity<?> getAllUsers() {
        List<User> users = userService.getAllUsernames();
        if(users.isEmpty()) {
            return new ResponseEntity<Object>("No user!", HttpStatus.OK);
        }
        return new ResponseEntity<Object>(users,HttpStatus.OK);
    }
//    @RequestMapping(value ="/add",method = RequestMethod.POST)
//    @ResponseBody
//    public void add() {
//        List<User> us = new ArrayList<User>();
//        User u = new User();
//        u.setUsername("Mark");
//        us.add(u);
//        u = new User();
//        u.setUsername("Fawofolo");
//        us.add(u);
//        userService.saveUsers(us);
//    }

    @RequestMapping(value="/add",method = RequestMethod.GET)
    @ResponseBody
    public void add() {
        List<User> us = new ArrayList<User>();
        User u = new User();
        u.setUsername("Mark");
        us.add(u);
        u = new User();
        u.setUsername("Fawofolo");
        us.add(u);
        userService.saveUsers(us);
        System.out.println("Successfully");
    }

//    @RequestMapping(value="/addUser",method = RequestMethod.POST)
    @PostMapping("/addusers")
    public ResponseEntity<?> addUser(@RequestBody User u) {
        userService.saveUser(u);
        return new ResponseEntity<Object>("Add user successfully",HttpStatus.OK);
    }

    @GetMapping("/getproducts")
    public ResponseEntity<?> getAllProducts() {
        List<Product> products = productService.getAllproducts();
        if(products.isEmpty()) {
            return new ResponseEntity<Object>("No product!", HttpStatus.OK);
        }
        return new ResponseEntity<Object>(products,HttpStatus.OK);
    }
}
