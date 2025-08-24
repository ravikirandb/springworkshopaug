package com.productcatalog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.productcatalog.model.ProductDto;
import com.productcatalog.service.IProductService;

@RestController
public class ProductController {
	
	@Autowired
	private IProductService productService;
	
	//http://localhost:8080/products
	@PostMapping("/products")
	//data comes in body part of the request - use @RequestBody
	
	void addProduct(@RequestBody ProductDto productDto) {
		productService.addProduct(productDto);
	}
	
	//data comes in body part of the request - use @RequestBody
	//id should come in the request - only then record will be updated
	@PutMapping("/products")
	void updateProduct(@RequestBody ProductDto productDto) {
		productService.updateProduct(productDto);
	}
	
	//http://localhost:8080/products.priductId/1
	@GetMapping("/products/productId/{productId}")
	ProductDto getById(@PathVariable int productId) {
		return productService.getById(productId);
		
	}
	
	//http://localhost:8080/products
	@GetMapping("/products")
	List<ProductDto> getAll(){
		return productService.getAll();
	}
	
}
