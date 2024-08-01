package com.univale.holefinder.repository;

import com.univale.holefinder.model.account.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface userRepository extends JpaRepository<User, Long> {
    @Override
    Optional<User> findById(Long id);

    @Override
    void deleteById(Long id);

    Optional<User> findByUsername(String username);
}
