package com.myblog.blogapp.repository;

import com.myblog.blogapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository  extends JpaRepository<User, Long> {

        Optional<User> findByEmail(String Email);
        Optional<User> findByUsernameOrEmail(String Username, String email );
        Optional<User> findByUsername(String username);

        Boolean existsByUsername(String username);
        Boolean existsByEmail(String email);

}
