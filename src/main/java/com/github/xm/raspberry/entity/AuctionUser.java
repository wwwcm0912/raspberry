package com.github.xm.raspberry.entity;

import java.io.Serializable;

public class AuctionUser implements Serializable {
    private Integer userId;

    private String userName;

    private String userPassword;

    private String userCardNo;

    private String userTel;

    private String userAddress;

    private String userPostNumber;

    private Integer userIsAdmin;

    private String userQuestion;

    private String userAnswer;

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserCardNo() {
        return userCardNo;
    }

    public void setUserCardNo(String userCardNo) {
        this.userCardNo = userCardNo == null ? null : userCardNo.trim();
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel == null ? null : userTel.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public String getUserPostNumber() {
        return userPostNumber;
    }

    public void setUserPostNumber(String userPostNumber) {
        this.userPostNumber = userPostNumber == null ? null : userPostNumber.trim();
    }

    public Integer getUserIsAdmin() {
        return userIsAdmin;
    }

    public void setUserIsAdmin(Integer userIsAdmin) {
        this.userIsAdmin = userIsAdmin;
    }

    public String getUserQuestion() {
        return userQuestion;
    }

    public void setUserQuestion(String userQuestion) {
        this.userQuestion = userQuestion == null ? null : userQuestion.trim();
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer == null ? null : userAnswer.trim();
    }
}