package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Bank;

public interface BankService {

	void add(Bank b);

	List<Bank> display();

	void delete(Integer id);

	Bank update(Integer id, Bank b);

}
