package com.NBA.JAVA.TestEncaosulation.a;

public class Student {
    public static void main(String[] args) {
        Person p = new Person();
        p.test();
        p.testDefault=1;    //同一个包下可以使用default
//        p.testprivate=1;    //同一个包下不可以使用private
        p.testProticted=1;    //同一个包下可以使用default
    }
}
