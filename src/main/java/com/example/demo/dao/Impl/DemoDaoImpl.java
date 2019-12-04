package com.example.demo.dao.Impl;

import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

import com.example.demo.dao.DemoDao;
import com.example.demo.dto.AccountDto;
import com.example.demo.entity.Account;
import com.example.demo.entity.AccountLDC1;
import com.example.demo.entity.AccountLDC2;
import com.example.demo.entity.AccountLDC3;

@Component
public class DemoDaoImpl implements DemoDao {
	
	public AccountDto getAccount(int LDC, int id) {
		
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
		
        return new DozerBeanMapper().map(acc, AccountDto.class);
		
	}


}
