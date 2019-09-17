package com.codeclan.fileservice.fileservice.repository;

import com.codeclan.fileservice.fileservice.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
