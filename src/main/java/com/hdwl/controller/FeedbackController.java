package com.hdwl.controller;

import com.hdwl.entity.HdwlFeedback;
import com.hdwl.service.FeedbackService;
import com.hdwl.util.RetResult;
import org.springframework.beans.factory.annotation.Autowired;
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
}
