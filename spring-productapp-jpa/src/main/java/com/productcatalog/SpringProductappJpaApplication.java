package com.productcatalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.productcatalog.model.ProductDto;
import com.productcatalog.service.IProductService;

@SpringBootApplication
public class SpringProductappJpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringProductappJpaApplication.class, args);
	}
	
	@Autowired 
	private IProductService productService;
	
	@Override 
	public void run(String... args) throws Exception {
		//create a productdto object
		ProductDto productDto = new ProductDto("Mobile",null,"Samsung","Electronics",20000);
		//call add product method
//		productService.addProduct(productDto);
		
		//get by Id
		ProductDto nproductDto=productService.getById(1);
		System.out.println(nproductDto);
		System.out.println();
		
		productService.getAll().forEach(System.out::println);
	}

}
