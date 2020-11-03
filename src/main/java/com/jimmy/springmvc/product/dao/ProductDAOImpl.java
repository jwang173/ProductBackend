package com.jimmy.springmvc.product.dao;

import com.jimmy.springmvc.product.entity.User;
import org.hibernate.SessionFactory;
import com.jimmy.springmvc.product.entity.Product;
//import com.mysql.cj.xdevapi.SessionFactory;
import org.hibernate.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDAOImpl implements ProductDAO{
    @Autowired
    private SessionFactory sessionFactory;

    public int addProduct(Product p) {
        return (Integer) sessionFactory.getCurrentSession().save(p);
    }

    public List<Product> findAll() {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Product.class);
        return criteria.list();
    }

    public Product findProductById(int id) {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Product.class);
        return (Product)criteria;//criteria?
    }
}
