package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Bank {

	@Id
	private Integer accNo;
	private String name;
	private Float balance;
	
	//uotdfut7fo7utfufufug
	
	
}
