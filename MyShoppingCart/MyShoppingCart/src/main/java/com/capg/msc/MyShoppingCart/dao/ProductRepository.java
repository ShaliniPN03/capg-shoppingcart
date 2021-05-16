package com.capg.msc.MyShoppingCart.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.msc.MyShoppingCart.bean.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	
	
}