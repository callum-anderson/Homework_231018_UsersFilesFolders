package com.codeclan.example.UserFolderFiles.repositories;

import com.codeclan.example.UserFolderFiles.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
