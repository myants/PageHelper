package com.example.demo.service.inter;


import java.util.List;

import com.example.demo.model.Person;

public interface PageHelperServiceInter {
	public List<Person> personService(int page,int size); 
}
