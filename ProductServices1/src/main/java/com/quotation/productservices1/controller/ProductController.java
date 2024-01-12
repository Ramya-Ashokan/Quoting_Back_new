package com.quotation.productservices1.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quotation.productservices1.dto.ProductResponse;
import com.quotation.productservices1.entity.Product;
import com.quotation.productservices1.services.ProductServices;

import lombok.RequiredArgsConstructor;
@RestController
@RequiredArgsConstructor

public class ProductController {
	private final ProductServices productServices;
	@PostMapping("/insert")
	public ResponseEntity<String> insertData(@RequestBody Product product)
	 {try {
	        System.out.println(product);
	        productServices.createProduct(product);
	        return ResponseEntity.ok("Product inserted successfully");
	    } catch (Exception e) {
	        e.printStackTrace();
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error inserting product");
	    }}
	@GetMapping("/display")
	public List<Product> displayProduct()
	{
	return productServices.displayAll();
	}
	@GetMapping("singleproduct/{pid}")
	public ProductResponse getProductByPid(@PathVariable ("pid") int pid)
	{
	return productServices.getSingleProduct(pid);
	}
	@DeleteMapping("/deleteProduct")
	public String deleteProduct(@RequestParam int pid)
	{
	System.out.println(pid);
	productServices.removeProduct(pid);
	return "deleted";
	}
	@PutMapping("/editProduct/{pid}")
	public String updatingProduct(@PathVariable int pid,@RequestBody Product product)
	{
	System.out.println(pid);
	System.out.println(product);
	boolean prod = productServices.productChecking(pid);
	System.out.println("checking");
	if(!prod)
	{
	return "Product not Existing";
	}
	else
	{
	productServices.productUpdating(product);
	return "updated";
	}
	}

}
