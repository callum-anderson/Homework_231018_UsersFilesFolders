package com.codeclan.example.UserFolderFiles.repositories;

import com.codeclan.example.UserFolderFiles.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
