package com.NBA.JAVA;
//测试异常处理

public class TestException {
    public static void main(String[] args) {
        System.out.println("第一步");
        try {
            int i = 1/0;    //数学运算异常
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("第二步");
    }
}
