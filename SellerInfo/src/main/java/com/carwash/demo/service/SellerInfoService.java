package com.carwash.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.carwash.demo.model.Seller;
import com.carwash.demo.repo.Repository;

public class SellerInfoService {
	@Autowired
	Repository  repo;
	public Seller addInfo(Seller seller) {
		System.out.println("In seller");
		System.out.println(seller);
		return repo.save(seller);
		
		
		
	}
}
