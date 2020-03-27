package com.hdwl.service;

import com.hdwl.mapper.*;
import com.hdwl.entity.HdwlFeedback;
import com.hdwl.util.RetResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangdenghui
 * @version 1.0.0
 * @createdate 2020/3/24 16:22
 * @description
 */
@Service
public class FeedbackService {

    @Autowired
    private FeedbackMapper feedbackMapper;


    public RetResult getList(HdwlFeedback hdwlFeedback){

        List<HdwlFeedback> dishList =feedbackMapper.getList(hdwlFeedback);

        return RetResult.ok().setData(dishList);
    }
}
