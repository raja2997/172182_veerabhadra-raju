package com.seller.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.seller.pojo.Seller;

public interface SellerRepository extends MongoRepository<Seller, String>{

}
