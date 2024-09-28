package com.graphql.learn.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.graphql.learn.entities.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    List<Product> findByCategory(String category);
}