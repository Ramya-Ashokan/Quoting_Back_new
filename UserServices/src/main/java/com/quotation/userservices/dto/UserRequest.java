package com.quotation.userservices.dto;

import java.util.Date;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
	private String userName;
    private String email;
	private String password;
	private String confirmPassword;
	private Date dob;
	private String address;
	private String phoneno;
	private String gender;
	
}
