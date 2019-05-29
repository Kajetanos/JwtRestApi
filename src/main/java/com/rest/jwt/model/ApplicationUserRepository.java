package com.rest.jwt.model;

//import com.rest.jwt.model.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String username);
}
