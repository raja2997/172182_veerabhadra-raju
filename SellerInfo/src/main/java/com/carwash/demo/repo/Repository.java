package com.carwash.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.carwash.demo.model.Seller;

public interface Repository extends MongoRepository<Seller, String>{

}
