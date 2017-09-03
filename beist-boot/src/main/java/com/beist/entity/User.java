package com.beist.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "U")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_ID_")
    private Long userId;

    @Column(name = "USER_TELE")
    private String userTele;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "NICK_NAME")
    private String nickName;

    @Column(name = "USER_SEX")
    private String userSex;

    @Column(name = "USER_AGE")
    private Integer userAge;

    @Column(name = "USER_RANGE")
    private String userRange;

    @Column(name = "USER_LEVEL")
    private String userLevel;

    @Column(name = "USER_QUESTION")
    private String userQuestion;

    @Column(name = "USER_ANSWER")
    private String userAnswer;

    @Column(name = "USER_PLAN_WORD_NUMBER")
    private Integer userPlanWordNumber;

    @Column(name = "USER_ICON")
    private String userIcon;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserTele() {
        return userTele;
    }

    public void setUserTele(String userTele) {
        this.userTele = userTele;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserRange() {
        return userRange;
    }

    public void setUserRange(String userRange) {
        this.userRange = userRange;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    public String getUserQuestion() {
        return userQuestion;
    }

    public void setUserQuestion(String userQuestion) {
        this.userQuestion = userQuestion;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    public Integer getUserPlanWordNumber() {
        return userPlanWordNumber;
    }

    public void setUserPlanWordNumber(Integer userPlanWordNumber) {
        this.userPlanWordNumber = userPlanWordNumber;
    }

    public String getUserIcon() {
        return userIcon;
    }

    public void setUserIcon(String userIcon) {
        this.userIcon = userIcon;
    }
}