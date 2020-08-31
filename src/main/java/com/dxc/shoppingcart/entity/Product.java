package com.dxc.shoppingcart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
	@Id
	@Column(name="product id")
	private Integer productId;
	@Column(name="product image")
	private String productImage;
	@Column(name="product name")
	private String productName;
	private int quantity;
	private double price;
	private float discount;

}
