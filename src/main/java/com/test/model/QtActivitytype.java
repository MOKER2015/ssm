package com.test.model;

import java.io.Serializable;

public class QtActivitytype implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qt_activitytype.id
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qt_activitytype.name
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table qt_activitytype
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qt_activitytype.id
     *
     * @return the value of qt_activitytype.id
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qt_activitytype.id
     *
     * @param id the value for qt_activitytype.id
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qt_activitytype.name
     *
     * @return the value of qt_activitytype.name
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qt_activitytype.name
     *
     * @param name the value for qt_activitytype.name
     *
     * @mbggenerated Fri May 13 20:45:38 CST 2016
     */
    public void setName(String name) {
        this.name = name;
    }
}