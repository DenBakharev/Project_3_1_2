package com.example.pp_3_1_2.repository;

import com.example.pp_3_1_2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
