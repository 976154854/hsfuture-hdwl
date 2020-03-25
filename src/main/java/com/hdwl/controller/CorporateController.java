package com.hdwl.controller;

import com.hdwl.entity.HdwlCorporate;
import com.hdwl.service.CorporateService;
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
 *@author wangdh
 *@description
 *@date 2020/3/24
 */
@RestController
@RequestMapping("/corporate")
public class CorporateController {
    @Resource
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

        return corporateService.getCorporateList(corporate);
    }

    /**
     *@author wangdh
     *@description 新增（修改[带id参数]）公司信息
     *@date 2020/3/25
     *@param
     *@return com.hdwl.util.RetResult
     */
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(@RequestBody HdwlCorporate corporate, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return bindingResult.getFieldError().getDefaultMessage();
        }else{
            corporateService.saveCorporate(corporate);
            return "保存成功";
        }
    }

}
