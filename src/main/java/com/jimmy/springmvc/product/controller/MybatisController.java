package com.jimmy.springmvc.product.controller;

//import com.jarvis.springboot_mybatis.Entity.User;
//import com.jarvis.springboot_mybatis.mapper.UserMapper;
import com.jimmy.springmvc.product.service.ProductService;
import com.jimmy.springmvc.product.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.jimmy.springmvc.product.entity.Product;
import com.jimmy.springmvc.product.entity.User;
import java.util.List;

@Controller
@CrossOrigin
public class MybatisController {

    @Autowired
    private UserService userService;
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public List<User> hello(){
        List<User> user = userService.getAllUsernames();
        System.out.println(user);
        return user;
    }

    @RequestMapping(value = "/helloproducts", method = RequestMethod.GET)
    @ResponseBody
    public List<Product> helloproducts(){
        List<Product> products = productService.getAllproducts();
        System.out.println(products);
        return products;
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    @ResponseBody
    public Product AddProduct(@RequestBody Product p) {
        productService.addProduct(p);
        return p;
    }
}
