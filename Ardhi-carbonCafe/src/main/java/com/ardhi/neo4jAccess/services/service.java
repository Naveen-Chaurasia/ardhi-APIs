package com.ardhi.neo4jAccess.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ardhi.neo4jAccess.Entities.Category;
import com.ardhi.neo4jAccess.Entities.ProductComponents;
import com.ardhi.neo4jAccess.Entities.Products;
import com.ardhi.neo4jAccess.repositories.CategoryRepo;
import com.ardhi.neo4jAccess.repositories.Level0repo;
import com.ardhi.neo4jAccess.repositories.Level1Repo;
import com.ardhi.neo4jAccess.repositories.productComponentsRepo;
import com.ardhi.neo4jAccess.repositories.productRepo;

@Service
public class service {

	@Autowired
	CategoryRepo cr;
	@Autowired
	productRepo pr;
	@Autowired
	productComponentsRepo pcr;
	@Autowired
	Level0repo l0r;
	
	@Autowired
	Level1Repo l1r;
	
	
//	
//	public List<Products> getProducts()
//	{
//		return pr.findAll();
//	}
//	
//	public List<ProductComponents> getProductComponents()
//	{
//		return pcr.findAll();
//	}
	
//	public List<Category> getCategories() {
//		
//		
//		/*
//		 * List<Category> l= new ArrayList<Category>(); l=cr.findAll();
//		 * System.out.println(l.size()); for(Category c:l) { System.out.println(c); }
//		 */
//		return null;//cr.findAll();
//	}

//	public Category findOneById(Long id) {
//		
//		return cr.findById(id)
//		
//	}
	

}
