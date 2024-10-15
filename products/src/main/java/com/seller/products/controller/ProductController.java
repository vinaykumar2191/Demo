//package com.seller.products.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.seller.products.entity.Product;
//import com.seller.products.service.ProductService;
//
//@Controller
//@RequestMapping("/api/products")
//public class ProductController {
//	
//	@Autowired
//	ProductService service;
//	
//	@PostMapping
//	public ResponseEntity<Product> addCar(@RequestBody Product product ){
//		service.insertProduct(product);
//		return new ResponseEntity<>(product, HttpStatus.CREATED);
//	}
//	
//	@GetMapping
//	public ResponseEntity<List<Product>> getAllProducts(){
//		return new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK);
//	}
//
//}
