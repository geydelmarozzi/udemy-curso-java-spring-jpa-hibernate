package com.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.entities.Category;
import com.curso.entities.Product;

//Anotação abaixo @Repository é opcional, pois ela já extend a classe de Repositório do JPA
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
