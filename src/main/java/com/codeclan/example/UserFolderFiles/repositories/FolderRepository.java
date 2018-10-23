package com.codeclan.example.UserFolderFiles.repositories;

import com.codeclan.example.UserFolderFiles.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
