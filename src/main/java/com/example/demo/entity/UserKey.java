package com.example.demo.entity;

import java.util.Date;

public class UserKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbggenerated Tue Jun 27 18:24:36 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.create_date
     *
     * @mbggenerated Tue Jun 27 18:24:36 CST 2017
     */
    private Date createDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbggenerated Tue Jun 27 18:24:36 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbggenerated Tue Jun 27 18:24:36 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.create_date
     *
     * @return the value of user.create_date
     *
     * @mbggenerated Tue Jun 27 18:24:36 CST 2017
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.create_date
     *
     * @param createDate the value for user.create_date
     *
     * @mbggenerated Tue Jun 27 18:24:36 CST 2017
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}