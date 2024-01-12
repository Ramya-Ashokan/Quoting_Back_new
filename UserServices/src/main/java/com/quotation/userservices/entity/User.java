package com.quotation.userservices.entity;
import java.util.Date;

import jakarta.persistence.Column;
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
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer userId;
	private String userName;
	@Column(unique = true)
	private String email;
	private String password;
	private String confirmPassword;
	private Date dob;
	private String address;
	@Column(unique = true)
	private String phoneno;
	private String gender;
	
	
}
