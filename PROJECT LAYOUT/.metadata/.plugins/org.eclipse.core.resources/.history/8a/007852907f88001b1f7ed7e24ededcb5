package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Product;
import com.example.demo.mod.OrderRequest;
import com.example.demo.mod.OrderResponse;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.ProductRepository;

@RestController
public class HomeController {
	@Autowired
	CustomerRepository cr;

	@Autowired
	ProductRepository pr;
	
	@PostMapping("/place")
	public Customer placerder(@RequestBody OrderRequest request) {
		return cr.save(request.getCustomer());

	}
	@PostMapping("/place1")
	public Customer placerder1(@RequestBody Customer request) {
		return cr.save(request);

	}
	@GetMapping("/findorder")
	public List<Customer> findAllOrder()
	{
		return cr.findAll();

	}

	@GetMapping("/findorderselect")
	public List<OrderResponse> getJoinInformation1()
	{
		return cr.getJoinInformation();

	}
	@GetMapping("/ppp/{pid}")
	public List<Product> getproduct(@PathVariable ("pid") int pid)
	{
		return pr.findAllByPid(pid);

	}
	@GetMapping("/right")
	public List<OrderResponse> getJoinInformation2()
	{
		return cr.getJoinInformation12();
	}

	@GetMapping("/left")
	public List<OrderResponse> getJoinInformation()
	{
		return cr.getleftjoin();
	}
	@GetMapping("/inner")
	public List<OrderResponse> getJoinInformation3()
	{
		return cr.getInnerJoin();
	}
}
