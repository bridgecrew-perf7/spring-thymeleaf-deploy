package com.demo.employeemanagementsystem.service;


import com.demo.employeemanagementsystem.dto.UserRegistrationDto;
import com.demo.employeemanagementsystem.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
	User save(UserRegistrationDto registrationDto);
}
