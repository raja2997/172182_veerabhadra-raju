package com.carwash.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.carwash.demo.model.Seller;

import com.carwash.demo.repo.Repository;
import com.carwash.demo.service.SellerInfoService;

@RestController
public class Controller {

	@Autowired
	SellerInfoService service;
	
	@PostMapping("/adddetails")
	public Seller addInfo(@RequestBody Seller seller) {
		System.out.println("In seller Info controller");
		System.out.println(seller);
		return service.addInfo(seller);
		
		
		
	}

	
}
