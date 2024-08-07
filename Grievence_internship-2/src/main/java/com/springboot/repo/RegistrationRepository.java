package com.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.RegistrationEntity;


@Repository
public interface RegistrationRepository extends JpaRepository<RegistrationEntity, Long> {
    RegistrationEntity findByUsernameAndPassword(String username, String password);
}
