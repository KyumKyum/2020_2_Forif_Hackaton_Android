package com.example.a2020_2forifhackathon;

// 시간 상 관계로 set, get 만들지 않았음
public class User {
    public String userId;
    public String password;
    public String country;
    public String nickname;

    public User(){
    }
    public User(String userId, String password, String country, String nickname){
        this.userId = userId;
        this.password = password;
        this.country = country;
        this.nickname = nickname;
    }
}