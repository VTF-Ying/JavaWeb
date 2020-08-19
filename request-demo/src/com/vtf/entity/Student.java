package com.vtf.entity;

import java.util.Arrays;

/**
 * @ProjectName: JavaWeb
 * @ClassName: Student
 * @Description: (学生实体类)
 * @Author: VTF
 * @create: 2020-08-15 17:38
 */
public class Student {

    private String username;
    private String password;
    private String[] hobby;

    public Student() {
    }

    public Student(String username, String password, String[] hobby) {
        this.username = username;
        this.password = password;
        this.hobby = hobby;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", hobby=" + Arrays.toString(hobby) +
                '}';
    }
}
