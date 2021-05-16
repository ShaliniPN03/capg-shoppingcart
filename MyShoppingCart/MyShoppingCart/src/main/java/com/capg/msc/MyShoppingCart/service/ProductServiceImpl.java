package com.capg.msc.MyShoppingCart.service;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.msc.MyShoppingCart.bean.Product;
import com.capg.msc.MyShoppingCart.dao.ProductRepository;
import com.capg.msc.MyShoppingCart.dao.CustomProductRepository;
//import com.capg.msc.MyShoppingCart.dao.CustomProductRepositoryImpl;

@Service
public class ProductServiceImpl implements ProductService
{
	@Autowired
	private ProductRepository repo;
	private CustomProductRepository rep;

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return repo.findAll();
		
	}

	@Override
	@Transactional
	public Product saveProduct(Product p) {
		// TODO Auto-generated method stub
		repo.save(p);
		return p;
	}

	@Override
	public List<Product> getAllProductsByCategory(String category) {
		// TODO Auto-generated method stub
		return rep.getProductByCategory(category);
	}

	@Override
	public List<Product> getAllProductsByCategoryAndPrice(String category, int range1, int range2) {
		// TODO Auto-generated method stub
		return rep.getProductByCategoryAndPrice(category,range1,range2);
	}

}
