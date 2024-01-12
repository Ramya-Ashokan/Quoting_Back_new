package com.quotation.productservices1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quotation.productservices1.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
