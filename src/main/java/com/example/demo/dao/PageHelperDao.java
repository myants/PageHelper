package com.example.demo.dao;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Person;

@Mapper
public interface PageHelperDao {
	public List<Person> selectDao();
}
