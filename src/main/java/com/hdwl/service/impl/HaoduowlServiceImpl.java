package com.hdwl.service.impl;

import com.hdwl.dao.HaoduowlDao;
import com.hdwl.entity.Haoduowl;
import com.hdwl.service.HaoduowlService;
import com.hdwl.util.RetResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 学生信息Service实现类
 * @author Administrator
 *
 */
@Service("studentService")
public class HaoduowlServiceImpl implements HaoduowlService{
	
	@Resource
	private HaoduowlDao haoduowlDao;
	
	@Override
	public void add(Haoduowl haoduowl) {
		haoduowlDao.save(haoduowl);
	}

	@Override
	public RetResult getPage() {
		List<Haoduowl> haoduowls = haoduowlDao.getPage();
		return RetResult.ok().setData(haoduowls);
	}
}
