package com.jd.demo.service.product;

import java.util.List;

import com.jd.demo.domain.product.Category;
import com.jd.demo.domain.product.ProQuery;
import com.jd.demo.domain.product.Product;

public interface ProductService {
	
	public List<Category> getSortList();
	
	public List<Product> getFloorProductList(ProQuery proQuery);
	
	public List<Product> getSearchProductList(ProQuery proQuery);
	
	public int getTotalPages(ProQuery proQuery);
	
}
