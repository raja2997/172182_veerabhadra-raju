package com.buyer.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.buyer.demo.pojo.Buyer;
import com.buyer.demo.repo.BuyerRepository;


@RestController
public class Controller {

	@Autowired
	  BuyerRepository res;
	
	@PostMapping("/addbuyer")
	public Buyer addBuyer(@RequestBody Buyer buyer) {
		System.out.println("In seller");
		System.out.println(buyer);
		 return res.save(buyer);
		
		
		
	}

	
}
