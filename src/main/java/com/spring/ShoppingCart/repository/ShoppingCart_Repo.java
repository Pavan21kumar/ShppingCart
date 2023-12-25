package com.spring.ShoppingCart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.ShoppingCart.entity.ShoppingCart;

public interface ShoppingCart_Repo extends JpaRepository<ShoppingCart, Integer> {

}
