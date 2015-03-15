package com.lysenko.dao;

import com.lysenko.entities.Product;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Vladyslav on 15.03.2015.
 */

@Repository
@Transactional
public class ProductDAO implements ProductDAOInterface   {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Product addProduct(Product product) {
        em.persist(product);
        return product;
    }

    @Override
    public Product getProduct(int id) {
        return em.find(Product.class,id);
    }

    @Override
    public void saveProduct(Product product) {
        em.merge(product);
    }
}
