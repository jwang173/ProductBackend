package com.jimmy.springmvc.product.service;

import com.jimmy.springmvc.product.dao.ProductDAO;
import com.jimmy.springmvc.product.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDAO productDAO;

    public void addProduct(Product p){
        productDAO.addProduct(p);
    }

    public List<Product> getAllproducts() {
        return productDAO.findAll();
    }

    public Product getProductById(int id) {
        return productDAO.findProductById(id);
    }




}
