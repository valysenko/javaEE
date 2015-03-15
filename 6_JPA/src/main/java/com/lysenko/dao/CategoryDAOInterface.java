package com.lysenko.dao;

import com.lysenko.entities.Category;
import org.springframework.stereotype.Repository;

/**
 * Created by Vladyslav on 15.03.2015.
 */
@Repository
public interface CategoryDAOInterface {
    public Category addCategory(Category category);
}
