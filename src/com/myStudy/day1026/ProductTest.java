package com.myStudy.day1026;

/**
 * @author dengdogegg
 * @version 1.0.0
 * @ClassName CusmerTest.java
 * @Description 生产与消费问题
 * @createTime 2021年10月26日 21:37:00
 */
public class ProductTest {
    public static void main(String[] args) {
        Clark clark = new Clark();
        Producer producer = new Producer(clark);
        Consumer consumer = new Consumer(clark);
        producer.setName("生产者");
        consumer.setName("消费者");
        producer.start();
        consumer.start();
    }
}

/*
店员类
 */
class Clark {
    private int profucerNumber = 0;

    public synchronized void producePreducer() {

        if (profucerNumber < 20) {
            profucerNumber++;
            System.out.println(Thread.currentThread().getName() + "开始生产第" + profucerNumber + "产品");
            notify();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void produceConsumer() {
        if (profucerNumber > 0) {

            System.out.println(Thread.currentThread().getName() + "开始消费第" + profucerNumber + "产品");
            profucerNumber--;
            notify();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//生产者线程
class Producer extends Thread {
    private Clark clark;

    public Producer(Clark clark) {
        this.clark = clark;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "开始生产");
        while (true) {
            try {
                Thread.sleep(120);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clark.producePreducer();
        }
    }
}

//消费者线程
class Consumer extends Thread {
    private Clark clark;

    public Consumer(Clark clark) {
        this.clark = clark;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "开始消费");
        while (true) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clark.produceConsumer();
        }
    }
}
