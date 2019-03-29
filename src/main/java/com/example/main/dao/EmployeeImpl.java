package com.example.main.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public class EmployeeImpl implements Employee{

	@Override
	public String changeName() {
		// TODO Auto-generated method stub
		return "bhakti";
	}

}
