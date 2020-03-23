package com.hdwl.service;

import com.hdwl.entity.Haoduowl;
import com.hdwl.util.RetResult;

/**
 * 学生信息Service接口
 * @author Administrator
 *
 */
public interface HaoduowlService {

	/**
	 * 添加学生信息
	 * @param haoduowl
	 */
	public void add(Haoduowl haoduowl);

	RetResult getPage();
}

