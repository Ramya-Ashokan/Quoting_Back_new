package com.quotation.productservices1.dto;

import com.quotation.productservices1.entity.ParameterType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ParametersResponse {
	private int para_id;
	private String para_name;
	private String para_desp;
	private String para_details;
	private ParameterType para_type;
}
