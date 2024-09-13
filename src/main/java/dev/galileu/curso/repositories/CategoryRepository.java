package dev.galileu.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.galileu.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
