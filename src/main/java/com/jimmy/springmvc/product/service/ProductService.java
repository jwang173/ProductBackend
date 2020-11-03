package com.jimmy.springmvc.product.service;

import com.jimmy.springmvc.product.entity.Product;

import java.util.List;

public interface ProductService {
    public void addProduct(Product p);

    public List<Product> getAllproducts();

    public Product getProductById(int id);
}
