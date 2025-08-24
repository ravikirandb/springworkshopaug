package com.productcatalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productcatalog.model.Product;

public interface IProductRepository extends JpaRepository<Product, Integer>{
	

}
