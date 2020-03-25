package com.hdwl.dao;

import com.hdwl.entity.HdwlCorporate;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *@author wangdh
 *@description
 *@date 2020/3/24
 */
public interface CorporateDao extends JpaRepository<HdwlCorporate,Integer> {

}
