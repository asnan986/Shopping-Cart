package com.dxc.shoppingcart.entity;

import java.io.Serializable;

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
@Table(name="user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1489363463467278306L;
	
	@Id
	@Column(name="username",unique=true)
	private String userName;
	@Column(name="firstname")
	private String firstName;
	@Column(name="lastname")
	private String lastName;
	private String password;
	private String email;
	@Column(name="mobileno")
	private Long mobileNo;
	private String roles;
}
