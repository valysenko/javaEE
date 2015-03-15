package com.lysenko.services;

import com.lysenko.dao.CategoryDAOInterface;
import com.lysenko.dao.ProductDAOInterface;
import com.lysenko.entities.Category;
import com.lysenko.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Vladyslav on 15.03.2015.
 */
public class CategoryService implements CategoryServiceInterface{

    @Autowired
    CategoryDAOInterface categoryDAO;

    public Category addCategory(Category category){
        categoryDAO.addCategory(category);
        return category;
    }
}
