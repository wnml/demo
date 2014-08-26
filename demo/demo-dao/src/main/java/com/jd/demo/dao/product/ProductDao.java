package com.jd.demo.dao.product;

import java.util.List;

import com.jd.demo.domain.product.Category;
import com.jd.demo.domain.product.ProQuery;
import com.jd.demo.domain.product.Product;

public interface ProductDao {
	public List<Category> getSortList(Category category);
	public List<Product> getProductList(ProQuery proQuery);
	public int getItemNum(ProQuery proQuery);
}
