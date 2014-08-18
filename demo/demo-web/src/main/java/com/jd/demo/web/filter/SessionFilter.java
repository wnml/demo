package com.jd.demo.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 做一些请求的拦截，比如登陆过滤，安全检查等
 * @author liujinfeng
 *
 */
public class SessionFilter implements Filter{

	public void destroy() {
		
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
		System.out.println("filter test");
		filterChain.doFilter(request, response);
		
	}

	public void init(FilterConfig arg0) throws ServletException {
		
		
	}

}
