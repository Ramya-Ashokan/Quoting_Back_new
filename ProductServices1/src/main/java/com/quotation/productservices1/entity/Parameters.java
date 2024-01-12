package com.quotation.productservices1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Parameters {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int para_id;
private String para_name;
private String para_desp;
private String para_details;
private ParameterType para_type;
}

