package com.weather.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weather.entity.Users;

/**
 * @author Swapnil Mane
 */
public interface UserRepository extends JpaRepository<Users, String> {
	
	Optional<Users> findByEmail(String email);
}
