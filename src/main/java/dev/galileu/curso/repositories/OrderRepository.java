package dev.galileu.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.galileu.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
