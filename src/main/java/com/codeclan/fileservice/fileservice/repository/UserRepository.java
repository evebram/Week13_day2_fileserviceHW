package com.codeclan.fileservice.fileservice.repository;

import com.codeclan.fileservice.fileservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
