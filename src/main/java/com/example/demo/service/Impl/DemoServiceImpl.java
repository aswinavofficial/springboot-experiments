package com.example.demo.service.Impl;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Account;
import com.example.demo.entity.AccountLDC1;
import com.example.demo.entity.AccountLDC2;
import com.example.demo.entity.AccountLDC3;
import com.example.demo.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {
	
	public Account getAccount(int LDC, int id) {
		
		Account acc = null;
		
		if(LDC == 1) {
			 acc = new AccountLDC1(id, "LDC1", "US");	 
		}
		
		if(LDC ==2 ) {
			acc = new AccountLDC2(id,"LDC2","US","LA");
		}
		
		if(LDC ==3 ) {
			acc = new AccountLDC3(id,"LDC3","US","MA","11111");
		}
		
		return acc;
		
	}

}
