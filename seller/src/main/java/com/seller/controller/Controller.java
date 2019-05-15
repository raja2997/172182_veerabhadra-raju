package com.seller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.javasampleapproach.springrest.mongodb.model.SellerSignup;
//import com.javasampleapproach.springrest.mongodb.model.Customer;
//import com.javasampleapproach.springrest.mongodb.model.SellerSignup;
import com.seller.pojo.Seller;
import com.seller.service.SellerService;




@RestController
public class Controller {
	Seller cseller;
	
	@Autowired
	SellerService service;
	
	@PostMapping("/addseller")
	public Seller addSeller(@RequestBody Seller seller) {
		System.out.println("In seller add controller");
		System.out.println(seller);
		 return service.addSeller(seller);
}
	
	@PostMapping("/validateseller")
	public Seller validateSeller(@RequestBody Seller userlog) {
		cseller=service.validateSeller(userlog);
		return cseller;

}
	@GetMapping("/seller")
	public List<Seller> getAllSellers() {
		System.out.println("Get all Sellers...");

		List<Seller> seller=service.getAllSellers();
		System.out.println("After list");
		System.out.println(seller);
		return seller;
	}
	
}