package com.productcatalog.service;

import java.util.List;

import com.productcatalog.model.ProductDto;

public interface IProductService {
	void addProduct(ProductDto productDto);
	void updateProduct(ProductDto productDto);
	ProductDto getById(int productId);
	List<ProductDto> getAll();
}
