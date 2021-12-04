package com.myStudy.day1025;

/**
 * @author dengdogegg
 * @version 1.0.0
 * @ClassName LazyMan.java
 * @Description 使用同步机制将单例模式懒汉式的线程安全
 * @createTime 2021年10月25日 23:21:00
 */
public class LazyMan {

}

class Bank{
    private Bank(){}

    private static Bank instant = null;

    public static  Bank getInstant() {
        //同步代码块。效率差
        synchronized (Bank.class) {
            if (instant==null) {
                instant = new Bank();
            }
            return instant;
        }
    }
}

class Bank1{
    private Bank1(){}

    private static Bank1 instant1 = null;
    //同步方法
    public static synchronized Bank1 getInstant() {
            if (instant1==null) {
                instant1 = new Bank1();
            }
        return instant1;
    }

}

class Bank3{
    private Bank3(){}

    private static Bank3 instant3 = null;
    //同步方法,效率稍高
    public static  Bank3 getInstant() {
        if (instant3==null) {
            synchronized (Bank3.class){
                if (instant3==null) {
                    instant3 = new Bank3();
                }
            }
        }
        return instant3;
    }

}

