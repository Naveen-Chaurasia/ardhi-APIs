package com.ardhi.neo4jAccess.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ardhi.neo4jAccess.repositories.Level0Repo;
import com.ardhi.neo4jAccess.repositories.Level1Repo;

@Service
public class service {

	@Autowired
	Level0Repo l0r;
	
	@Autowired
	Level1Repo l1r;
	
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
