package com.test.dao;

import com.test.model.QtActivitytype;
import com.test.model.QtActivitytypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QtActivitytypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qt_activitytype
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    int countByExample(QtActivitytypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qt_activitytype
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    int deleteByExample(QtActivitytypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qt_activitytype
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qt_activitytype
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    int insert(QtActivitytype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qt_activitytype
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    int insertSelective(QtActivitytype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qt_activitytype
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    List<QtActivitytype> selectByExample(QtActivitytypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qt_activitytype
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    QtActivitytype selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qt_activitytype
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    int updateByExampleSelective(@Param("record") QtActivitytype record, @Param("example") QtActivitytypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qt_activitytype
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    int updateByExample(@Param("record") QtActivitytype record, @Param("example") QtActivitytypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qt_activitytype
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    int updateByPrimaryKeySelective(QtActivitytype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qt_activitytype
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    int updateByPrimaryKey(QtActivitytype record);
}