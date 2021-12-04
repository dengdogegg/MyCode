package com.NBA.JAVA.TestEncaosulation;

public class TestSetGet {
    public static void main(String[] args) {
        TestJavaBean a = new TestJavaBean();
        a.setAge(1000);
        System.out.println(a.getAge());
        a.setAge(100);
        System.out.println(a.getAge());


    }
}
