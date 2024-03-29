package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AccountDto;
import com.example.demo.entity.Account;
import com.example.demo.service.DemoService;

@RestController
public class DemoController {
	
	@Autowired
	DemoService demoService;
	
	
	@GetMapping("/{LDC}/{id}")
	public AccountDto getAccount(@PathVariable("LDC") int LDC, @PathVariable("id") int id) {
		
		
		return demoService.getAccount(LDC, id);	
	
		
	}

}
