package com.converter.currencyconversion.convertionService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.converter.currencyconversion.convertionService")
@EnableDiscoveryClient
public class ConvertionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConvertionServiceApplication.class, args);
	}

}

