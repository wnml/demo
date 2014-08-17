package com.jd.demo.service.test.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jd.demo.dao.test.TestDao;
import com.jd.demo.domain.Test;
import com.jd.demo.service.test.TestService;
@Service
public class TestServiceImpl implements TestService{
	
	private static final Log log = LogFactory.getLog(TestServiceImpl.class);
	
	@Autowired
	private TestDao testDao;
	
	@Transactional  //如果需要用到数据库事务
	public List<Test> myTest(Test test) {
		
		List<Test> temp = new ArrayList<Test>();
		try {
			temp = testDao.excuteTest(test);
		} catch (Exception e) {
			log.error("log test");
		}
		return temp;
	}
}
