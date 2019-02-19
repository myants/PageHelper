package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PageHelperDao;
import com.example.demo.model.Person;
import com.example.demo.service.inter.PageHelperServiceInter;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
@Service("service")
public class PageHelperServiceImpl implements PageHelperServiceInter {
	@Autowired
	private PageHelperDao pageHelperDao;
	@Override
	public List<Person> personService(int page, int size) {
		PageHelper.startPage(page, size);//使用分页插件，最核心的一句，即开启分页
		List<Person> list = pageHelperDao.selectDao();
		return list;
	}
	
}
