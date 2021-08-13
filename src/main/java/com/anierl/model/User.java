package com.anierl.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author JiMeiling
 * @Description
 * @create 2021-08-12 19:53
 */
//序列化：将当前状态写入持久层
//实现Serializable接口的目的是为类可持久化，比如在网络传输或本地存储，为系统的分布和异构部署提供先决条件.
    @Entity
public class User implements Serializable {
    private static final long serialVersionUID = 1l;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,unique = true)
    private String userName;
    @Column(nullable = false)
    private String passWord;
    @Column(nullable = false,unique = true)
    private String email;
    @Column(nullable = true,unique = true)
    private String nickName;
    @Column(nullable = false)
    private String regTime;

    public User() {
        super();
    }

    public User( String userName, String passWord, String email, String nickName, String regTime) {
       super();
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
        this.nickName = nickName;
        this.regTime = regTime;
    }

    public User( String userName, String passWord, String email, String regTime) {
        super();
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
        this.regTime = regTime;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }
}
