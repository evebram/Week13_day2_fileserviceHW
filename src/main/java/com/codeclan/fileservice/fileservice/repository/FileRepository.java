package com.codeclan.fileservice.fileservice.repository;

import com.codeclan.fileservice.fileservice.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
