package com.example.demo.entity;

public class User extends UserKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.uname
     *
     * @mbggenerated Tue Jun 27 18:24:36 CST 2017
     */
    private String uname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.pword
     *
     * @mbggenerated Tue Jun 27 18:24:36 CST 2017
     */
    private String pword;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.uname
     *
     * @return the value of user.uname
     *
     * @mbggenerated Tue Jun 27 18:24:36 CST 2017
     */
    public String getUname() {
        return uname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.uname
     *
     * @param uname the value for user.uname
     *
     * @mbggenerated Tue Jun 27 18:24:36 CST 2017
     */
    public void setUname(String uname) {
        this.uname = uname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.pword
     *
     * @return the value of user.pword
     *
     * @mbggenerated Tue Jun 27 18:24:36 CST 2017
     */
    public String getPword() {
        return pword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.pword
     *
     * @param pword the value for user.pword
     *
     * @mbggenerated Tue Jun 27 18:24:36 CST 2017
     */
    public void setPword(String pword) {
        this.pword = pword;
    }
}