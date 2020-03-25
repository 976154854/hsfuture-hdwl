package com.hdwl.service;

import com.hdwl.dao.CorporateDao;
import com.hdwl.entity.HdwlCorporate;
import com.hdwl.util.RetResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author wangdenghui
 * @version 1.0.0
 * @createdate 2020/3/24 16:23
 * @description
 */

public interface CorporateService {
    /**
     *@author wangdh
     *@description 查询公司列表
     *@date 2020/3/25
     *@param
     *@return com.hdwl.util.RetResult
     */
    RetResult getCorporateList(HdwlCorporate corporate);

    void saveCorporate(HdwlCorporate corporate);
}
