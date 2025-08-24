package com.productcatalog.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductDto {
	private String productName;
	private Integer productId;
	private String brand;
	private String category;
	private double price;
}
