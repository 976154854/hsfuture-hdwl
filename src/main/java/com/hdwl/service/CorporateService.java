package com.hdwl.service;

import com.hdwl.entity.HdwlCorporate;
import com.hdwl.mapper.CorporateMapper;
import com.hdwl.util.RetResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


/**
 * @author wangdenghui
 * @version 1.0.0
 * @createdate 2020/3/24 16:23
 * @description
 */
@Service
public class CorporateService {
    @Autowired
    private CorporateMapper corporateMapper;

    /**
     *@author wangdh
     *@description 查询列表
     *@date 2020/3/27
     *@param
     *@return com.hdwl.util.RetResult
     */
    public RetResult getList(HdwlCorporate corporate){
        List<HdwlCorporate> corporateList = corporateMapper.getList(corporate);
        return RetResult.ok().setData(corporateList);
    }

    /**
     *@author wangdh
     *@description 新增
     *@date 2020/3/27
     *@param
     *@return com.hdwl.util.RetResult
     */
    public RetResult insertCorporate(HdwlCorporate corporate){
        corporate.setCreateTime(new Date());
        corporateMapper.insertSelective(corporate);
        return RetResult.ok();
    }

    /**
     *@author wangdh
     *@description 修改
     *@date 2020/3/27
     *@param
     *@return com.hdwl.util.RetResult
     */
    public RetResult updateCorporate(HdwlCorporate corporate){
        corporateMapper.updateByPrimaryKeySelective(corporate);
        return RetResult.ok();
    }
}
