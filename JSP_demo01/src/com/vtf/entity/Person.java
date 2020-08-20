package com.vtf.entity;

/**
 * @ProjectName: JavaWeb
 * @ClassName: Person
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-08-20 14:27
 */
public class Person {

    private String name;
    private int age;

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

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
