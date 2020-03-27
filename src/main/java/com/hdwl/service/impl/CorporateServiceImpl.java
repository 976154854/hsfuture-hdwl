package com.hdwl.service.impl;

import com.hdwl.dao.CorporateDao;
import com.hdwl.entity.HdwlCorporate;
import com.hdwl.service.CorporateService;
import com.hdwl.util.RetResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 *@author wangdh
 *@description
 *@date 2020/3/24
 */
@Service("corporateService")
public class CorporateServiceImpl implements CorporateService{

    @Resource
    private CorporateDao corporateDao;
    /**
     *@author wangdh
     *@description 查询列表
     *@date 2020/3/25
     *@param 
     *@return 
     */
    @PersistenceContext
    private EntityManager em;
    public RetResult getCorporateList(HdwlCorporate corporate){
        String sql = "from HdwlCorporate a where 1=1 ";
        Query query = (Query) em.createQuery(sql);
        if(corporate.getId() != null){
            sql += " and a.id = ?1 ";
            query.setParameter(1,corporate.getId());
            System.out.println("123456");
        }
        //查询
        List<HdwlCorporate> list = query.getResultList();
        return RetResult.ok().setData(list);
    }

    /**
     *@author wangdh
     *@description 新增（修改[带id参数]）公司信息
     *@date 2020/3/25
     *@param
     *@return void
     */
    public void saveCorporate(HdwlCorporate corporate){
        corporateDao.save(corporate);
    }
}
