package com.EMS.employee_management_webapp.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.EMS.employee_management_webapp.dto.UserRegistrationDto;
import com.EMS.employee_management_webapp.model.User;


public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}