package com.bridgelabz;

class BaseClass {
    private String name;
    private int age;

    BaseClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
    }
}
