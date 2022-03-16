package com.example.talentmanagementsystem.entity;


/**
 * @author Mr.张
 */
public class JobSeeker {

  private String userId;
  private String userName;
  private String userPassword;
  private String userEmail;
  private java.sql.Timestamp createtime;
  private String userPhone;


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }


  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }


  public java.sql.Timestamp getCreatetime() {
    return createtime;
  }

  public void setCreatetime(java.sql.Timestamp createtime) {
    this.createtime = createtime;
  }


  public String getUserPhone() {
    return userPhone;
  }

  public void setUserPhone(String userPhone) {
    this.userPhone = userPhone;
  }

}
