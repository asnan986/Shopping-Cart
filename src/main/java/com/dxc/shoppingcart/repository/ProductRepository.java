package com.dxc.shoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dxc.shoppingcart.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
