//package com.seller.products.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.seller.products.entity.Product;
//import com.seller.products.repository.ProductRepository;
//
//@Service
//public class ProductService {
//	
//	@Autowired
//	private ProductRepository repo;
//	
//	public void insertProduct(Product product) {
//		repo.save(product);
//	}
//	
//	public List<Product> getAllProducts(){
//		return repo.findAll();
//	}
//	
//}
