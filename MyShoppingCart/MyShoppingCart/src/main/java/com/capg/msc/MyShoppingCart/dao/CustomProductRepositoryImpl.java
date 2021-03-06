package com.capg.msc.MyShoppingCart.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.capg.msc.MyShoppingCart.bean.Product;

public class CustomProductRepositoryImpl implements CustomProductRepository {
	@Autowired
	EntityManager entityManager;

	@Override
	public List<Product> getProductByCategory(String productCategory) {
		// TODO Auto-generated method stub
		Query q=entityManager.createQuery("from Product where category=:productCategory");
		q.setParameter("productCategory",productCategory);
		return q.getResultList();
	}

	/*@Override
	public List<Product> getProductByCategoryAndPrice(String productCategory, int range1, int range2) {
		// TODO Auto-generated method stub
		Query q=entityManager.createQuery("from product where category=:productCategory "+"and productCost BETWEEN:range1 and :range2");
		q.setParameter("productCategory",productCategory);
		q.setParameter("range1",range1);
		q.setParameter(range2, range2);
		return q.getResultList();*/
		
	

	@Override
	public List<Product> getProductByRating(int rating) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductByBrand(String brandName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductByName(String pName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductByCategoryAndPrice(String productCategory, int range1, int range2) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
