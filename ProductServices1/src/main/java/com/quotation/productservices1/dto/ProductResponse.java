package com.quotation.productservices1.dto;

import java.util.List;

import com.quotation.productservices1.entity.Features;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductResponse {
	private int pid;
	private String pname;
	private String desp;
	private String details;
	private int maxLocations;
	private String category;
	private List<Features> feature;
}
