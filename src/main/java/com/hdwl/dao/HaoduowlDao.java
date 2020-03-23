package com.hdwl.dao;

import com.hdwl.entity.Haoduowl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * 学生信息Dao接口
 * @author Administrator
 *
 */
public interface HaoduowlDao extends JpaRepository<Haoduowl,Integer>{

    @Query(value = "select * from hdwl a", nativeQuery = true)
    List<Haoduowl> getPage();
}
