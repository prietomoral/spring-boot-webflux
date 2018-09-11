package com.bolsaideas.springboot.webflux.models.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.bolsaideas.springboot.webflux.models.documents.Producto;

public interface ProductoDao extends ReactiveMongoRepository<Producto,String> {

}
