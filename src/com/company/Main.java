package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        char dengdogegg = '你';  // char表示一个字符的字符串,占两个字节
        char dengdogegg1 = 'a';
        String dengdogegg2 = "HelloWorld";    // String字符串不是基础数据类型，而是独立定义的类
        System.out.println(dengdogegg2);
        byte a = 100;
        int b = 100;
        short c = 100;
        long d = 5555;   // int类型
        long f = 111111111111l;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(f);
        double d1 = 3.13;
        double d2 = 3.13E2;  // 科学计数法
        System.out.println(d1);
        System.out.println(d2);

        float f1 = 1.65F;
//        float f2 = 1.65;  会报错。1.65是double类型的浮点常量，不能直接赋值给float
        System.out.println(f1);

        boolean b1 = true;
        boolean b2 = false;
        if (b1 == true) {
            System.out.println("b1是true");
        } else {
            System.out.println("b1是false");
        }
    }


}
