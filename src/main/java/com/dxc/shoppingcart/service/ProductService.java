package com.dxc.shoppingcart.service;

import java.util.List;

import com.dxc.shoppingcart.entity.Product;

public interface ProductService {

	List<Product> getAllProducts();

	List<Product> addUserProduct(Integer id);

}
