package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bank;
import com.example.demo.repository.BankRepository;

@Service
public class BankServiceImpl implements BankService{

	@Autowired
	private BankRepository bs;
	
	@Override
	public void add(Bank b) {
		// TODO Auto-generated method stub
		bs.save(b);
	}

	@Override
	public List<Bank> display() {
		// TODO Auto-generated method stub
		return bs.findAll();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		bs.deleteById(id);
	}

	@Override
	public Bank update(Integer id, Bank b) {
		// TODO Auto-generated method stub
		b.setAccNo(id);
		return bs.save(b);
	}

}
