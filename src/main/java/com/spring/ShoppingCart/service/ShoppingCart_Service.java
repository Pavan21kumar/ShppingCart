package com.spring.ShoppingCart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.ShoppingCart.entity.ShoppingCart;
import com.spring.ShoppingCart.repository.ShoppingCart_Repo;

@Service
public class ShoppingCart_Service {

	@Autowired
	private ShoppingCart_Repo dao;

	public ShoppingCart saveCart(ShoppingCart cart) {

		return dao.save(cart);

	}

	@SuppressWarnings("deprecation")
	public Optional<ShoppingCart> getcart(Integer cartId) {
		
		Optional<ShoppingCart> findById = dao.findById(cartId);
//		ShoppingCart cart = dao.getById(cartId);
	//	System.out.println(cart);
		return findById;
	}

	public ShoppingCart cartUpdate(Integer cartId) {
		return null;
		
	}

	public String cartDelete(Integer cartId) {
		
		dao.deleteById(cartId);
		return "cart is deleted.......";
		
	}

	public List<ShoppingCart> getAllCart() {
		
		return dao.findAll();
	}

}
