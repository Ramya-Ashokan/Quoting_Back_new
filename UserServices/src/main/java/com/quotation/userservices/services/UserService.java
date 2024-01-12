package com.quotation.userservices.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.quotation.userservices.dto.UserRequest;
import com.quotation.userservices.entity.LoginStatus;
import com.quotation.userservices.entity.User;
import com.quotation.userservices.repository.UserRepository;

import jakarta.websocket.server.ServerEndpoint;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	private final UserRepository userRepository;
	public String createUser(UserRequest userRequest)
	{
	User u=new User();
		u.setUserName(userRequest.getUserName());
		u.setEmail(userRequest.getEmail());
		u.setPassword(userRequest.getPassword());
		u.setConfirmPassword(userRequest.getConfirmPassword());
		u.setDob(userRequest.getDob());
		u.setAddress(userRequest.getAddress());
		u.setPhoneno(userRequest.getPhoneno());
		u.setGender(userRequest.getGender());
		userRepository.save(u);
		return null;
	}
	
	public ResponseEntity<LoginStatus> authenticateUser(String email, String password) {
	    User user = userRepository.findByEmail(email);
	System.out.println(user.getEmail()+" "+user.getPassword());
	    if (user != null && user.getPassword() != null && user.getPassword().equals(password)) {
	        // User authentication successful
	        LoginStatus response = new LoginStatus("success", user);
	        return ResponseEntity.ok(response);
	    } else {
	        // User authentication failed
	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new LoginStatus("invalid", null));
	    }
	}
}
