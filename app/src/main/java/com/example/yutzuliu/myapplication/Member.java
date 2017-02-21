package com.example.yutzuliu.myapplication;

/**
 * Created by yutzuliu on 2017/2/18.
 */

public class Member {

    private String account,name,gender,phone;
    public Member(String account , String name , String gender , String phone){
        this.account = account;
        this.name = name;
        this.gender = gender;
        this.phone = phone ;
    }

    public String getAccount(){
        return  account;
    }
    public void setAccount(String account){
        this.account=account;
    }
    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getGender(){
        return  gender;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public String getPhone(){
        return  phone;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }

}
