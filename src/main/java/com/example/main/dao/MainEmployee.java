package com.example.main.dao;

import org.springframework.stereotype.Component;

@Component
public class MainEmployee implements Employee{

	@Override
	public String changeName() {
		// TODO Auto-generated method stub
		return "Orosoft";
	}

}
