package com.lysenko;

import com.lysenko.entities.Product;
import com.lysenko.services.ProductService;
import com.lysenko.services.ProductServiceInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        ProductServiceInterface productService = (ProductServiceInterface) context.getBean("productService");
        productService.getProduct(1);
        productService.getProduct(1);
//        Product pd = new Product();
//        pd.setName("phone");
//        productService.addProduct(pd);
    }
}
