package cn.itcast.web;

import java.util.Date;

public class User {
     String name;
    int age;
    Date bithday;

    public User(String name, int age, Date bithday) {
        this.name = name;
        this.age = age;
        this.bithday = bithday;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBithday() {
        return bithday;
    }

    public void setBithday(Date bithday) {
        this.bithday = bithday;
    }
}
