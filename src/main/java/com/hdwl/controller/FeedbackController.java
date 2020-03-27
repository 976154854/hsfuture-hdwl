package com.hdwl.controller;

import com.hdwl.entity.HdwlFeedback;
import com.hdwl.service.FeedbackService;
import com.hdwl.util.RetResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *@author wangdh
 *@description
 *@date 2020/3/24
 */

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    /**
     * 商户端查询商品列表信息
     *@description:
     *@author: Ning long bin
     *@date:2019/12/13 11:23
     */
    @RequestMapping(value = "/getList",method = RequestMethod.POST)
    public RetResult getList(@RequestBody @Validated HdwlFeedback hdwlFeedback){
        return feedbackService.getList(hdwlFeedback);
    }
    /**
     *@author wangdh
     *@description 新增
     *@date 2020/3/27
     *@param
     *@return com.hdwl.util.RetResult
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public RetResult insertFeedback(@RequestBody @Validated(HdwlFeedback.Insert.class) HdwlFeedback feedback){
        return feedbackService.insertFeedback(feedback);
    }

    /**
     *@author wangdh
     *@description 修改
     *@date 2020/3/27
     *@param
     *@return com.hdwl.util.RetResult
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public RetResult updateFeedback(@RequestBody @Validated(HdwlFeedback.Update.class) HdwlFeedback feedback){
        return feedbackService.updateFeedback(feedback);
    }
}
