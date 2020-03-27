package com.hdwl.controller;

import com.hdwl.entity.HdwlCorporate;
import com.hdwl.entity.HdwlFeedback;
import com.hdwl.service.CorporateService;
import com.hdwl.util.RetResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *@author wangdh
 *@description
 *@date 2020/3/24
 */
@RestController
@RequestMapping("/corporate")
public class CorporateController {
    @Autowired
    private CorporateService corporateService;

    /**
     *@author wangdh
     *@description 查询公司列表
     *@date 2020/3/25
     *@param
     *@return com.hdwl.util.RetResult
     */
    @RequestMapping(value = "/getList",method = RequestMethod.POST)
    public RetResult getList(@RequestBody @Validated HdwlCorporate corporate){
        return corporateService.getList(corporate);
    }

    /**
     *@author wangdh
     *@description 新增
     *@date 2020/3/27
     *@param
     *@return com.hdwl.util.RetResult
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public RetResult insertCorporate(@RequestBody @Validated(HdwlCorporate.Insert.class) HdwlCorporate corporate){
        return corporateService.insertCorporate(corporate);
    }

    /**
     *@author wangdh
     *@description 修改
     *@date 2020/3/27
     *@param
     *@return com.hdwl.util.RetResult
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public RetResult updateCorporate(@RequestBody @Validated(HdwlCorporate.Update.class) HdwlCorporate corporate){
        return corporateService.updateCorporate(corporate);
    }

}
