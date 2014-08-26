package com.jd.demo.domain.product;

import java.util.ArrayList;
import java.util.List;
/**
 * 商品类目树形结构
 * @author liujinfeng
 *
 */
public class Category {
	private int sortId;
	private int parentId;
	private String sortName;
	private int sortLevel;
	private String description;
	
	/*******以下为非数据库映射字段******/
	private List<Category> childSortList = new ArrayList<Category>();
	
	
	
	public int getSortId() {
		return sortId;
	}
	public void setSortId(int sortId) {
		this.sortId = sortId;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public String getSortName() {
		return sortName;
	}
	public void setSortName(String sortName) {
		this.sortName = sortName;
	}
	public int getSortLevel() {
		return sortLevel;
	}
	public void setSortLevel(int sortLevel) {
		this.sortLevel = sortLevel;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Category> getChildSortList() {
		return childSortList;
	}
	public void setChildSortList(List<Category> childSortList) {
		this.childSortList = childSortList;
	}
	
}
