package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {

	@Autowired
	RestTemplate restT;
	
	@RequestMapping("/getReco")
	public List getData() {
		String url="http://prit:9081/postdata";
	List l=restT.getForObject(url, List.class);
	return l;
	}
}
