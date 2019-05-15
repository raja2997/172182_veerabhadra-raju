package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.pojo.BuyerData;
import com.example.demo.repository.BuyerRepository;



public class BuyerService {
	@Autowired
	  BuyerRepository res;
	
	public List<BuyerData> getBuyerInfo() {
		System.out.println("Get all Details...");

		List<BuyerData> info = new ArrayList<>();
		res.findAll().forEach(info::add);

		return info;
	}
	public BuyerData postBuyerInfo(BuyerData seller) {
	    System.out.println("In seller now");
	   
	   
	    BuyerData binfo = res.save(new BuyerData(seller.getSname(),seller.getBname(),seller.getTitle(),seller.getRating()));
		return binfo;
	}

}
