package com.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.entities.OrderItem;
import com.curso.entities.User;

//Anotação abaixo @Repository é opcional, pois ela já extend a classe de Repositório do JPA
@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
