package com.capg.msc.MyShoppingCart.web;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.msc.MyShoppingCart.bean.Product;
import com.capg.msc.MyShoppingCart.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductRestController {
	
	@Autowired
	private ProductService service;
	
	public ProductRestController()
	{
		System.out.println("----->> Product Rest Controller Constructor");
	}
	
	@GetMapping("/home")
	public String homeRequest()
	{
		return "Welcome: My Shopping App"+LocalDateTime.now();
	}
	
	@PostMapping("/product")
	public Product insertProduct(@RequestBody Product product)
	{
		service.saveProduct(product);
		return product;
	}
	
	@GetMapping("/product")
	public List<Product> getAllProducts()
	{
		return service.getAllProducts();
	}

}
