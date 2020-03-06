package cn.dsx.codegenerator.dao;

import cn.dsx.codegenerator.pojo.EmpDaily;

public interface EmpDailyMapper {
    int deleteByPrimaryKey(Integer empDailyId);

    int insert(EmpDaily record);

    int insertSelective(EmpDaily record);

    EmpDaily selectByPrimaryKey(Integer empDailyId);

    int updateByPrimaryKeySelective(EmpDaily record);

    int updateByPrimaryKey(EmpDaily record);
}