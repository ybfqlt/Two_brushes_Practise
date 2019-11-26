package com.test1;

import java.util.Date;

/**
 * @Classname User
 * @Description TODO
 * @Date 19-11-26 下午5:16
 * @Created by xns
 */
public class User {
    private String name;
    private int age;
    private Date birth;
    private boolean flag;


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

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                ", flag=" + flag +
                '}';
    }
    public User() {
        System.out.println("user create success...");
    }
}
