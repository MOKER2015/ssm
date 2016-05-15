package com.test.dao;

import com.test.model.QtUser;
import com.test.model.QtUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QtUserMapper {

    /*
    * 登录验证
    * */
    QtUser selectByRecord(QtUser qtUser);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qt_user
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    int countByExample(QtUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qt_user
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    int deleteByExample(QtUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qt_user
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qt_user
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    int insert(QtUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qt_user
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    int insertSelective(QtUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qt_user
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    List<QtUser> selectByExample(QtUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qt_user
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    QtUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qt_user
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    int updateByExampleSelective(@Param("record") QtUser record, @Param("example") QtUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qt_user
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    int updateByExample(@Param("record") QtUser record, @Param("example") QtUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qt_user
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    int updateByPrimaryKeySelective(QtUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qt_user
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    int updateByPrimaryKey(QtUser record);
}