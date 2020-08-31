package com.dxc.shoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dxc.shoppingcart.entity.Product;
import com.dxc.shoppingcart.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping("/admin")
	public String addAdminProduct(@ModelAttribute("product") Product product) {
		
		return "product-add";
	}

	@RequestMapping("/")
	public String showUserPage(ModelMap model) {

		model.addAttribute("listOfAllProducts", productService.getAllProducts());

		return "product-user-view";

	}

	@RequestMapping("/add")
	public String addUserProduct(ModelMap model, @RequestParam("productid") Integer id) {

		model.addAttribute("cart", productService.addUserProduct(id));

		return "product-user-view";
	}

}
