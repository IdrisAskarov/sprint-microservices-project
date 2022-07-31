package com.mightycoder.sprmicrosproj1.user.repository;

import com.mightycoder.sprmicrosproj1.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
