package com.hdwl.util;/**
 * Created by Administrator on 2020/3/27.
 */

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import java.util.List;
import java.util.Map;

/**
 * @description:
 * @Author: Ning long bin
 * @time: 2020/3/27 12:11
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
    boolean exists(T var1);

    List<T> getListAll();

    List<T> getPageInfo(Map var1);

}