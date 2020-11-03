package com.jimmy.springmvc.product.dao;

import com.jimmy.springmvc.product.entity.Product;

import java.util.List;

public interface ProductDAO {
    public int addProduct(Product p);

    public List<Product> findAll();

    public Product findProductById(int id);
}
