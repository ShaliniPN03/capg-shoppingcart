package com.capg.msc.MyShoppingCart.dao;
import java.util.List;

import com.capg.msc.MyShoppingCart.bean.Product;

public interface CustomProductRepository {
	public List<Product> getProductByCategory(String productCategory);
	public List<Product> getProductByCategoryAndPrice(String productCategory,int range1,int range2);
	public List<Product> getProductByRating(int rating);
	public List<Product> getProductByBrand(String brandName);
	public List<Product> getProductByName(String pName);
}
