package dev.galileu.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.galileu.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
