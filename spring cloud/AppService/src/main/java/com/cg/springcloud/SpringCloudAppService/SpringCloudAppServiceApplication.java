package com.cg.springcloud.SpringCloudAppService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class SpringCloudAppServiceApplication {
	@Value("${service.instance.name}")
	private String instance;

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudAppServiceApplication.class, args);
	}
//	@RequestMapping
//	public String message()
//	{
//		return "hello from"+ instance;
//	}
	
	 @RequestMapping()
	 public String message1() { return "hello from"+ instance; }
	 
	
}
