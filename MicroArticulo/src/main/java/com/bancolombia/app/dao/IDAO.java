package com.bancolombia.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.bancolombia.app.entities.Product;

public interface IDAO extends CrudRepository<Product, Integer> {

}