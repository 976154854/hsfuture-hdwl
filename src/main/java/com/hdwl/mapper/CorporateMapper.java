package com.hdwl.mapper;

import com.hdwl.entity.HdwlCorporate;
import tk.mybatis.mapper.common.BaseMapper;


import java.util.List;

/**
 * @author wangdenghui
 * @version 1.0.0
 * @createdate 2020/3/27 14:01
 * @description
 */
public interface CorporateMapper extends BaseMapper<HdwlCorporate> {
    //查询列表信息
    List<HdwlCorporate> getList(HdwlCorporate corporate);
}
