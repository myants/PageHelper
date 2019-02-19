package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Person;
import com.example.demo.service.inter.PageHelperServiceInter;

@Controller
public class PageHelperController {
	@Autowired
	private PageHelperServiceInter service;

	
	@RequestMapping("/pagehelper")
	@ResponseBody
	public List<Person> pageHelperController(int page,int size) {
		System.out.println("controller");
		return service.personService(page, size);
	}
}
