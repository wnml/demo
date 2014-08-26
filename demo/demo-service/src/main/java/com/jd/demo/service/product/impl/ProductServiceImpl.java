package com.jd.demo.service.product.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jd.demo.dao.product.ProductDao;
import com.jd.demo.domain.product.Category;
import com.jd.demo.domain.product.ProQuery;
import com.jd.demo.domain.product.Product;
import com.jd.demo.service.product.ProductService;

/**
 * 商品相关类
 * @author liujinfeng
 *
 */
@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDao productDao;
	
	/**
	 * 查询左侧导航树形目录
	 */
	public List<Category> getSortList() {
		List<Category> sortList = new ArrayList<Category>();
		Map<Integer, Category> map1 = new HashMap<Integer, Category>();
		Category queryCg = new Category();
		queryCg.setParentId(0);
		List<Category> tempList = productDao.getSortList(queryCg);
		for (Category cg : tempList) {
			
			map1.put(cg.getSortId(), cg);
			sortList.add(cg);
			
			queryCg.setParentId(cg.getSortId());
			List<Category> tempList1 = productDao.getSortList(queryCg);
			for (Category cg1 : tempList1) {
				Map<Integer, Category> map2 = new HashMap<Integer, Category>();
				
				map2.put(cg1.getSortId(), cg1);
				map1.get(cg1.getParentId()).getChildSortList().add(cg1);//
				
				queryCg.setParentId(cg1.getSortId());
				List<Category> tempList2 = productDao.getSortList(queryCg);
				for(Category cg2 : tempList2){
					map2.get(cg2.getParentId()).getChildSortList().add(cg2);
				}
			}
		}
		return sortList;
	}
	
	public List<Product> getFloorProductList(ProQuery proQuery) {
		List<Product> listProduct = new ArrayList<Product>();
		listProduct = productDao.getProductList(proQuery);
		for(Product pro : listProduct){
			pro.setImageUrl("http://img14.360buyimg.com/N4/g10/M00/1D/0D/rBEQWVNfepsIAAAAAAEumGGwobYAAFxCAHk5z4AAS6w394.jpg");
			pro.setDetailUrl("http://item.jd.com/1115374.html");
		}
		return listProduct;
	}

	public List<Product> getSearchProductList(ProQuery proQuery) {
		List<Product> listProduct = new ArrayList<Product>();
		int startPos = (proQuery.getCurrentPage()-1)*proQuery.getItemsPerPage();
		proQuery.setStartPos(startPos);
		listProduct = productDao.getProductList(proQuery);
		for(Product pro : listProduct){
			pro.setImageUrl("http://img13.360buyimg.com/n7/jfs/t172/40/2226819040/109961/180dfa58/53c8d4c3Nead405c4.jpg");
			pro.setDetailUrl("http://item.jd.com/1115374.html");
		}
		return listProduct;
	}
	
	public int getTotalPages(ProQuery proQuery) {
		int itemNum = productDao.getItemNum(proQuery);
		int itemsPerPage = proQuery.getItemsPerPage();
		int pageNum = itemNum%itemsPerPage > 0? itemNum/itemsPerPage +1 : itemNum/itemsPerPage;
		return pageNum;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/********以下为未使用的方法*********/
	
	/**
	 * 递归查询类目
	 * @param sortList
	 * @param queryCg
	 */
	private void sortListRecursion(List<Category> sortList, Category queryCg) {
		List<Category> tempList = new ArrayList<Category>();
		
		tempList = productDao.getSortList(queryCg);
		if (tempList.size() > 0) {
			for(Category cg : tempList){
				sortList.add(cg);
				queryCg.setParentId(cg.getSortId());
				sortListRecursion(sortList, queryCg);
			}
		}
	}
	
	
	private void printSortList(List<Category> sortList) {
		for(Category cg : sortList){
			String str = "";
			for (int i = 0; i < cg.getSortLevel(); i++) {
				str +=" ";
			}
			str = str+cg.getSortId() + " " + cg.getParentId() + " " + cg.getSortName();
			System.out.println(str);
		}
	}

}
