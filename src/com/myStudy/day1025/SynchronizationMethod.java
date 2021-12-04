package com.myStudy.day1025;

/**
 * @author dengdogegg
 * @version 1.0.0
 * @ClassName day1025.java
 * @Description
 * 使用同步方法解决实现runnable接口的线程安全问题
 * 同步方法的总结：
 * 同步方法仍涉及到同步监视器，只是不需要我们显示的声明；
 * 非静态方法同步监视器this
 * 静态方法同步监视器当前类本身
 * @createTime 2021年10月25日 21:19:00
 */
public class SynchronizationMethod {
    public static void main(String[] args) {
        Windows1 windows1 = new Windows1();
        Thread thread1 = new Thread(windows1);
        Thread thread2 = new Thread(windows1);
        Thread thread3 = new Thread(windows1);
        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");
        thread1.start();
        thread2.start();
        thread3.start();
    }

}

class Windows1 implements Runnable {
    private int ticket = 100;
    boolean flag = true;

    @Override
    public void run() {
        while (ticket>0) {
            show();
        }
    }

    private synchronized void show() {  //同步监视器：this
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "：卖票,票号为" + ticket);
            ticket--;
        }
    }
}