package com.jd.demo.web.test;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.jd.demo.domain.product.Category;
import com.jd.demo.domain.product.ProQuery;
import com.jd.demo.domain.product.Product;
import com.jd.demo.service.product.ProductService;
import com.jd.demo.service.test.TestService;

@Controller
public class TestController {
	@Autowired
	private TestService testService;
	@Autowired
	private ProductService productService;
	
	private Gson gson = new Gson();
	
	/**
	 * 网站首页
	 * @return
	 */
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView();
		/**左侧导航分类**/
		mv.addObject("sortList", productService.getSortList());
		mv.setViewName("index");
		return mv;
	}
	
	/**
	 * 根据条件查询到的商品列表页
	 * @param request
	 * @param proQuery
	 * @return
	 */
	@RequestMapping(value = "/conditionSearch", method = RequestMethod.GET)
	public ModelAndView productList(HttpServletRequest request, ProQuery proQuery){
		ModelAndView mv = new ModelAndView();
		mv.addObject("proQuery", gson.toJson(proQuery));
		mv.addObject("totalPages", productService.getTotalPages(proQuery));
		mv.addObject("productList", productService.getSearchProductList(proQuery));
		mv.setViewName("product/conditionSearch");
		return mv;
	}
	
	/**
	 * ajax获取商品列表
	 * @param request
	 * @param proQuery
	 * @return
	 */
	@RequestMapping(value = "/searchProductList", method = RequestMethod.POST)
	@ResponseBody
	public List<Product> getSearchProductList(HttpServletRequest request, ProQuery proQuery ) {
		return productService.getSearchProductList(proQuery);
	}
	
	/**
	 * ajax获取首页楼层商品列表
	 * @param request
	 * @param proQuery
	 * @return
	 */
	@RequestMapping(value = "/floorProductList", method = RequestMethod.POST)
	@ResponseBody
	public List<Product> getFloorProductList(HttpServletRequest request, ProQuery proQuery ) {
		return productService.getFloorProductList(proQuery);
	}
	
	/**
	 * 获取左侧导航类目
	 * @return
	 */
	@RequestMapping(value = "/sortList", method = RequestMethod.GET,produces = "application/json")
	@ResponseBody
	public List<Category> getStr() {
		return productService.getSortList();
	}
	
	
	
	

	
}
