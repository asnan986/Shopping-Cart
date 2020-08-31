package com.dxc.shoppingcart.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dxc.shoppingcart.entity.Product;
import com.dxc.shoppingcart.repository.ProductRepository;

public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	private List<Product> cart= new ArrayList<Product>();

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();

	}

	@Override
	public List<Product> addUserProduct(Integer id) {
		cart.add(productRepository.findById(id).get());
		return cart;
	}

}
