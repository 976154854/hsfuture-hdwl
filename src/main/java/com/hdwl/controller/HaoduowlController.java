package com.hdwl.controller;

import com.hdwl.entity.Haoduowl;
import com.hdwl.service.HaoduowlService;
import com.hdwl.util.RetResult;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 学生信息controller层
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/student")
public class HaoduowlController {

	@Resource
	private HaoduowlService haoduowlService;
	
	/**
	 * 添加学生信息
	 * @param haoduowl
	 * @param bindingResult
	 * @return
	 */
	@Transactional(readOnly = false, rollbackFor = Exception.class)
	@RequestMapping("/inser")
	public String add(@RequestBody @Validated({Haoduowl.Insert.class}) Haoduowl haoduowl, BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return bindingResult.getFieldError().getDefaultMessage();
		}else{
			haoduowlService.add(haoduowl);
			return "添加成功";
		}
	}
	/**
	 *
	 *@description: 列表
	 *@author: Ning long bin
	 *@date:2020/3/23 15:40
	 */
	@RequestMapping(value = "/getPage",method = RequestMethod.POST)
	public RetResult getPage(@RequestBody @Validated Haoduowl search){

		return haoduowlService.getPage();

	}
}
