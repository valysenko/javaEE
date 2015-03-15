package com.lysenko.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Vladyslav on 15.03.2015.
 */

@Entity
@Table(name="category")
public class Category {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    private String name;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_fk")
    @OrderBy("name ASC")
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
