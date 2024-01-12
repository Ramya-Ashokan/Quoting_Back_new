package com.quotation.productservices1.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FeaturesResponse {
	private int fid;
	private String fname;
	private String fdesp;
	private String fdetails;
	private List<ParametersResponse> parameters;
}
