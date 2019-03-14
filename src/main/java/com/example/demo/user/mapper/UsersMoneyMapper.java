package com.example.demo.user.mapper;

import com.example.demo.user.model.UsersMoney;
import com.example.demo.user.model.UsersMoneyExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UsersMoneyMapper {
    long countByExample(UsersMoneyExample example);

    int deleteByExample(UsersMoneyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UsersMoney record);

    int insertSelective(UsersMoney record);

    List<UsersMoney> selectByExample(UsersMoneyExample example);

    UsersMoney selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UsersMoney record, @Param("example") UsersMoneyExample example);

    int updateByExample(@Param("record") UsersMoney record, @Param("example") UsersMoneyExample example);

    int updateByPrimaryKeySelective(UsersMoney record);

    int updateByPrimaryKey(UsersMoney record);
}