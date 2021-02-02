package com.costudy.tongxunlu;

/**
 * @author : 张富旭
 * time : 1/28/21 14
 * email : 2390109890@qq.com
 * des :
 */
public class MyContacts {

    private String name;
    private String number;
    private String userId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "MyContacts{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
