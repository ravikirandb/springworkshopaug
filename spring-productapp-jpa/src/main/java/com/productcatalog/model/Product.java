package com.productcatalog.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
//import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity //tablename,entityname, classname are same
//@Table(name="product_details")// tomap to an existing table
public class Product {
	private String productName;
	@Id
	@GeneratedValue
	private Integer productId;
	private String brand;
	private String category;
	@Column(name="cost")
	private double price;
}
