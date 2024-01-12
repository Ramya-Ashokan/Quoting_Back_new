package com.quotation.productservices1.services;

import java.util.List;
import org.springframework.stereotype.Service;

import com.quotation.productservices1.dto.ProductResponse;
import com.quotation.productservices1.entity.Product;
import com.quotation.productservices1.repository.ProductRepository;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class ProductServices {
//	private final ProductRepository productRepository;
//	public void createProduct(Product product)
//	{
//	System.out.println("Insert working");
//	productRepository.save(product);
//	}
//	public List<Product> displayAll()
//	{
//	return productRepository.findAll();
//	}
//	public void removeProduct(int pid)
//	{
//	productRepository.deleteById(pid);
//	}
//	public void productUpdating(Product product)
//	{
//	System.out.println("Updating");
//	productRepository.save(product);
//	}
//	public boolean productChecking(int pid)
//	{
//	return productRepository.existsById(pid);
//	}
//	public ProductResponse getSingleProduct(int pid)
//	{
//	Product prod = productRepository.getById(pid);
//	ProductResponse productResponse = convertToDTO(prod);
//	return productResponse;
//	}
//	private ProductResponse convertToDTO(Product product) {
//	    List<FeaturesResponse> featuresResponseList = convertFeaturesListToDTO(product.getFeature());
//
//	    ProductResponse productResponse = ProductResponse.builder()
//	            .pid(product.getPid())
//	            .pname(product.getPname())
//	            .desp(product.getDesp())
//	            .details(product.getDetails())
//	            .category(product.getCategory())
//	            .maxLocations(product.getMaxLocations())
//	            .feature(featuresResponseList)
//	            .build();
//
//	    return productResponse;
//	}
//
//	private List<FeaturesResponse> convertFeaturesListToDTO(List<Features> featuresList) {
//	    return featuresList.stream()
//	            .map(this::convertFeaturesToDTO)
//	            .collect(Collectors.toList());
//	}
//
//	private FeaturesResponse convertFeaturesToDTO(Features features) {
//	    return FeaturesResponse.builder()
//	            .fid(features.getFid())
//	            .fname(features.getFname())
//	            .fdesp(features.getFdesp())
//	            .fdetails(features.getFdetails())
//	            .parameters(null)
//	            .build();
//	}
	private final ProductRepository productRepository;
	public void createProduct(Product product)
	{
	System.out.println("Insert working");
	productRepository.save(product);
	}
	public List<Product> displayAll()
	{
	return productRepository.findAll();
	}
	public void removeProduct(int pid)
	{
	productRepository.deleteById(pid);
	}
	public void productUpdating(Product product)
	{
	System.out.println("Updating");
	productRepository.save(product);
	}
	public boolean productChecking(int pid)
	{
	return productRepository.existsById(pid);
	}
	public ProductResponse getSingleProduct(int pid)
	{
	Product prod = productRepository.getById(pid);
	ProductResponse product_Response = convertToDTO(prod);
	return product_Response;
	}
	private ProductResponse convertToDTO(Product product)
	{
	ProductResponse product_Response = ProductResponse.builder()
	.pid(product.getPid())
	.pname(product.getPname())
	.desp(product.getDesp())
	.details(product.getDetails())
	.category(product.getCategory())
	.maxLocations(product.getMaxLocations())
	.feature(product.getFeature())
	.build();
	return product_Response;
}}
