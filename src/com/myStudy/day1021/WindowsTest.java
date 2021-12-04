package com.myStudy.day1021;

/**
 * @author dengdogegg
 * @version 1.0.0
 * @ClassName WindowsTest.java
 * @Description 线程同步，解决卖票问题
 * 1、出现重票、错票；
 * 2、问题出现原因：共享数据被多个线程处理
 * 3、如何解决：正在处理的线程，不允许其他线程操作
 * 4、同步机制，解决线程的安全问题
 * 方法1：同步代码块
 * synchronize(同步监视器){
 * //需要被同步的代码
 * }
 * 说明：操作共享数据的代码，即为需要被同步的代码
 * 共享数据：多个线程操作的变量
 * 同步监视器：俗称：锁,任何一个对象都可以成为锁，要求：多个线程必须要求共用一把锁
 * 补充：在实现runnable接口创建多线程的方式中，可以考虑this充当同步监视器
 *
 * 方法2：同步方法
 *
 * @createTime 2021年10月21日 22:35:00
 */
public class WindowsTest {
    public static void main(String[] args) {
        Windows windows = new Windows();
        Thread thread1 = new Thread(windows);
        Thread thread2 = new Thread(windows);
        Thread thread3 = new Thread(windows);
        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");
        thread1.start();
        thread2.start();
        thread3.start();
    }


}

class Windows implements Runnable {
    private int ticket = 100;
    Object object =new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (object) {
                if (ticket > 0) {
//
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    System.out.println(Thread.currentThread().getName() + "：卖票,票号为" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }

        }
    }
}
