package com.jd.demo.web.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jd.demo.domain.Test;
import com.jd.demo.service.test.TestService;

@Controller
public class TestController {
	@Autowired
	private TestService testService;
	
	@RequestMapping(value = "/getTest/{userNo}", method = RequestMethod.GET,produces = "application/json")
	@ResponseBody
	public List<String> getResourceCodeByUserNo( @PathVariable String userNo) {
		List<String> temp = new ArrayList<String>();
		temp.add("hello");
		temp.add(userNo);
		return temp;
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView();
		Test test = new Test();
		test.setMsgRoute("1");
		mv.addObject("test", testService.myTest(test));
		mv.setViewName("test");
		String temp = null;
		temp.split("_");
		return mv;
	}

	
}
