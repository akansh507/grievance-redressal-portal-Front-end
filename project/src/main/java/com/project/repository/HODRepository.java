package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.entity.HODEntity;

@Repository
public interface HODRepository extends JpaRepository<HODEntity, Long> {
}