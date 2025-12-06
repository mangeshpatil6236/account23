package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bank;
import com.example.demo.service.BankService;

@RestController
public class BankController {

	@Autowired
	private BankService bs;
	
	@PostMapping("add")
	private void add(@RequestBody Bank b) {
		bs.add(b);
	}
	
	@GetMapping("display")
	private List<Bank>display(){
		return bs.display();
	}
	
	@PostMapping( "delete = {id}")
	private void delete(@PathVariable Integer id) {
		bs.delete(id);
	}
	
	@PutMapping("update = {id}")
	private Bank update(@PathVariable Integer id, @RequestBody Bank b) {
		return bs.update(id,b);
	}
	
}
