package com.rest.jwt.model.repository;

//import com.rest.jwt.model.entity.ApplicationUser;
import com.rest.jwt.model.entity.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String username);
}
