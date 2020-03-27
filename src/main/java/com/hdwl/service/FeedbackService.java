package com.hdwl.service;

import com.hdwl.mapper.*;
import com.hdwl.entity.HdwlFeedback;
import com.hdwl.util.RetResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * @author wangdenghui
 * @version 1.0.0
 * @createdate 2020/3/24 16:22
 * @description
 */
@Service
public class FeedbackService{

    @Autowired
    private FeedbackMapper feedbackMapper;

/**
 *@author wangdh
 *@description 查询公司信息
 *@date 2020/3/27
 *@param
 *@return com.hdwl.util.RetResult
 */
    public RetResult getList(HdwlFeedback hdwlFeedback){
        List<HdwlFeedback> dishList =feedbackMapper.getList(hdwlFeedback);
        return RetResult.ok().setData(dishList);
    }

    /**
     *@author wangdh
     *@description 新增
     *@date 2020/3/27
     *@param
     *@return com.hdwl.util.RetResult
     */
    public RetResult insertFeedback(HdwlFeedback hdwlFeedback){
        hdwlFeedback.setCreatTime(new Date());
        feedbackMapper.insertSelective(hdwlFeedback);
        return RetResult.ok();
    }

    /**
     *@author wangdh
     *@description 修改
     *@date 2020/3/27
     *@param
     *@return com.hdwl.util.RetResult
     */
    public RetResult updateFeedback(HdwlFeedback hdwlFeedback){
        feedbackMapper.updateByPrimaryKeySelective(hdwlFeedback);
        return RetResult.ok();
    }
}
