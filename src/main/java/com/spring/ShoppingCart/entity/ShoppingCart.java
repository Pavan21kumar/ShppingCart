package com.spring.ShoppingCart.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Component
@Entity
public class ShoppingCart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartId;
	private String cartItem;
	private double totalBil;

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public String getCartItem() {
		return cartItem;
	}

	public void setCartItem(String cartItem) {
		this.cartItem = cartItem;
	}

	public double getTotalBil() {
		return totalBil;
	}

	public void setTotalBil(double totalBil) {
		this.totalBil = totalBil;
	}

}
