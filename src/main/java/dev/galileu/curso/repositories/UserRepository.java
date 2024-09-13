package dev.galileu.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.galileu.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
