package com.mysteam.entity;

import java.util.List;

public class User {
    private Integer userId;

    private String account;

    private String password;

    private Integer authority;

    private Boolean gender;

    private Double balance;

    private String company;

    private List<User> buddyList;


    private List<User> fansList;

    private List<Game> wishList;

    public List<User> getFansList() {
        return fansList;
    }

    public void setFansList(List<User> fansList) {
        this.fansList = fansList;
    }

    public List<Game> getWishList() {
        return wishList;
    }

    public void setWishList(List<Game> wishList) {
        this.wishList = wishList;
    }

    public List<User> getBuddyList() {
        return buddyList;
    }

    public void setBuddyList(List<User> buddyList) {
        this.buddyList = buddyList;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getAuthority() {
        return authority;
    }

    public void setAuthority(Integer authority) {
        this.authority = authority;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }
}