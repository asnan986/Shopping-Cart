package com.dxc.shoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dxc.shoppingcart.entity.User;
import com.dxc.shoppingcart.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public String showRegisterPage(@ModelAttribute("login") User user) {

		return "login";

	}

	@PostMapping("/login")
	public String loginUser(@ModelAttribute("login") User user, BindingResult result) {

		if (result.hasErrors())
			return "login";
		else {
			if (userService.validateLogin(user)) {
				if (user.getRoles().equals("admin"))
					return "admin";
				else if (user.getRoles().equals("user"))
					return "user";
			}
			return "invalid";

		}
	}

	@RequestMapping("/showregister")
	public String showRegister(@ModelAttribute User user) {

		return "register";

	}

	@PostMapping("/register")
	public String registerUser(@ModelAttribute("user") User user, BindingResult result) {
		if (result.hasErrors())
			return "register";
		else {
			userService.addUser(user);
			return "success";
		}

	}

}
