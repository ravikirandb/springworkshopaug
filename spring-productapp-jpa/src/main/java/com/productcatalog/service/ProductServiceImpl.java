package com.productcatalog.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productcatalog.model.Product;
import com.productcatalog.model.ProductDto;
import com.productcatalog.repository.IProductRepository;

@Service
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private IProductRepository repository;
	
	@Override
	public void addProduct(ProductDto productDto) {
		// convert dto into entity and call repo for saving
		Product product=mapper.map(productDto, Product.class);
		//use repo to save it
		//check if id is available
		//if not available generate it and save as new record
		//if available - check if record is there in db -> if yes update it
		//if yes update it, if no create a new record
		repository.save(product);

	}

	@Override
	public void updateProduct(ProductDto productDto) {
		// TODO Auto-generated method stub
		Product product=mapper.map(productDto, Product.class);
		repository.save(product);
	}

	@Override
	public ProductDto getById(int productId) {
		 Optional<Product> opt = repository.findById(productId);
		 //check if optional is having value
		 if(opt.isPresent()) {
			 Product product=opt.get();
		 
		 //if yes convert entity into dto
		ProductDto productDto= mapper.map(product, ProductDto.class);
		return productDto;
		}
		return null;
	}
	


	@Override
	public List<ProductDto> getAll() {
		List<Product> products=repository.findAll();
		// convert list to Stream
		return products.stream()
			//call
			.map(product-> mapper.map(product, ProductDto.class))
			//convert back to list - list of Product Dto
			.toList();
	}

}
