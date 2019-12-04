package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DemoDao;
import com.example.demo.dto.AccountDto;
import com.example.demo.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {
	
	@Autowired
	DemoDao demoDao;
	
	public AccountDto getAccount(int LDC, int id) {
		
		AccountDto acc = demoDao.getAccount(LDC,id);
		
		if(acc.getPincode() == null) {
			acc.setPincode("NA");
		}
		
		if(acc.getState() == null) {
			acc.setState("NA");
		}
		
		return acc;
		
	}

}
