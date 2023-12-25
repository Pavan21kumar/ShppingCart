package com.spring.ShoppingCart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.ShoppingCart.entity.ShoppingCart;
import com.spring.ShoppingCart.service.ShoppingCart_Service;

@RestController
public class ShppingCart_Controller {

	@Autowired
	private ShoppingCart_Service service;

	@PostMapping("/save-cart")
	public ShoppingCart saveCart(ShoppingCart cart) {

		return service.saveCart(cart);

	}

	@GetMapping("/get-cart-by-id")
	public Optional<ShoppingCart> getCart(@RequestParam int cartId) {

		Optional<ShoppingCart> cart1 = service.getcart(cartId);
		System.out.println(cart1);
		return cart1;
	}

	@PostMapping("/cart-update")
	public ShoppingCart updateCart(@RequestParam Integer cartId) {

		return service.cartUpdate(cartId);
	}

	@GetMapping("/cart-delete")
	public String cartDelete(@RequestParam Integer cartId) {

		return service.cartDelete(cartId);
	}

	@GetMapping("/get-all-cart")
	public List<ShoppingCart> getAllCart() {
		return service.getAllCart();
	}
	
	//public ResponseEntity save(@RequestParam int )

}
