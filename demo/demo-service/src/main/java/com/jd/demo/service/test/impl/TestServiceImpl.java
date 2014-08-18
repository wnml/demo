package com.jd.demo.service.test.impl;

import java.util.List;

import com.jd.demo.dao.test.TestDao;
import com.jd.demo.domain.test.Test;
import com.jd.demo.service.test.TestService;

public class TestServiceImpl implements TestService{
	
	private TestDao testDao;
	public void setTestDao(TestDao testDao) {
		this.testDao = testDao;
	}
	public List<Test> myTest(Test test) {
		return testDao.myTest(test);
	}

}
