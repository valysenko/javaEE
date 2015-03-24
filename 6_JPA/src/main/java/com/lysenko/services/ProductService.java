package com.lysenko.services;

import com.lysenko.dao.ProductDAO;
import com.lysenko.dao.ProductDAOInterface;
import com.lysenko.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Vladyslav on 15.03.2015.
 */

public class ProductService implements ProductServiceInterface{
    @Autowired
    ProductDAOInterface productDAO;

    public Product addProduct(Product product){
        product = productDAO.addProduct(product);
        System.out.println(product);
        return product;
    }

    public Product getProduct(int id) {
        return productDAO.getProduct(id);
    }

}
