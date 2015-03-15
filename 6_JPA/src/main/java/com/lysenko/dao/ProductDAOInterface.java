package com.lysenko.dao;

import com.lysenko.entities.Product;
import org.springframework.stereotype.Repository;

/**
 * Created by Vladyslav on 15.03.2015.
 */
@Repository
public interface ProductDAOInterface {
    Product addProduct(Product product);

    Product getProduct(int id);

    void saveProduct(Product lecture);

}
