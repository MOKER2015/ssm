package com.test.dao;

import com.test.model.QtPartin;
import com.test.model.QtPartinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QtPartinMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qt_partin
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    int countByExample(QtPartinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qt_partin
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    int deleteByExample(QtPartinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qt_partin
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qt_partin
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    int insert(QtPartin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qt_partin
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    int insertSelective(QtPartin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qt_partin
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    List<QtPartin> selectByExample(QtPartinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qt_partin
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    QtPartin selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qt_partin
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    int updateByExampleSelective(@Param("record") QtPartin record, @Param("example") QtPartinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qt_partin
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    int updateByExample(@Param("record") QtPartin record, @Param("example") QtPartinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qt_partin
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    int updateByPrimaryKeySelective(QtPartin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qt_partin
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    int updateByPrimaryKey(QtPartin record);
}