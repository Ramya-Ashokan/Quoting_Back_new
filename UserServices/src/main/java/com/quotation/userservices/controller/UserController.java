package com.quotation.userservices.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.quotation.userservices.dto.UserRequest;
import com.quotation.userservices.entity.LoginStatus;
import com.quotation.userservices.entity.User;
import com.quotation.userservices.repository.UserRepository;
import com.quotation.userservices.services.UserService;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/user")
public class UserController {
	
	private final UserService userService;
@PostMapping
@ResponseBody
public String addUser(@RequestBody UserRequest userRequest )
{
	System.out.println(userRequest);
	return userService.createUser(userRequest);
	
}
@PostMapping("/login")
public ResponseEntity<LoginStatus> loginUser(@RequestBody Map<String, String> credentials) {
    String email = credentials.get("email");
    String password = credentials.get("password");

    return userService.authenticateUser(email, password);
}
}
