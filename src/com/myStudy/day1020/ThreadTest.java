package com.myStudy.day1020;

/**
 * @author dengdogegg
 * @version 1.0.0
 * @ClassName day1020.java
 * @Description 实现Runnable类实例化thread
 * 继续Thread和实现Runnable
 * 优先实现，1、没有类单继承的局限性 2、适合多线程的数据共享
 * @createTime 2021年10月20日 22:32:00
 */
public class ThreadTest {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.setName("线程1");
        thread.start();
        Thread.currentThread().setName("主线程");
        test.testnum();
    }
}

class MyThread implements Runnable{
    @Override
    public void run() {
        test.testnum();
        }
    }

class test {
    static void testnum() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + "：" + i);
            }
        }
    }
}