package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class ConsumerforCrud1Application {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerforCrud1Application.class, args);
	}
	@Bean
	@LoadBalanced
	public RestTemplate restT() {
		RestTemplate restT=new RestTemplate();
		return restT;
	}
}
