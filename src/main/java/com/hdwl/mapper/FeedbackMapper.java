package com.hdwl.mapper;

import com.hdwl.entity.HdwlFeedback;
import com.hdwl.util.BaseMapper;


import java.util.List;

/**
 * @description:
 * @Author: Ning long bin
 * @time: 2019/12/11 9:31
 */

public interface FeedbackMapper extends BaseMapper<HdwlFeedback> {


    List<HdwlFeedback> getList(HdwlFeedback hdwlFeedback);
}
