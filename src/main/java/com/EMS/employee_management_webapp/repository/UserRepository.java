package com.EMS.employee_management_webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EMS.employee_management_webapp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
