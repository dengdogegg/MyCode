package com.myStudy.ago;

public class day02 {
    public static void main(String[] args) {
        /*
                for (; ; ) {
            Scanner scan = new Scanner(System.in);
            System.out.println("请输入分数，输入0退出");
            int number = scan.nextInt();
            if (number == 100) {
                System.out.println("奖励BWM跑车");

            } else if (number > 80 && number <= 99) {
                System.out.println("奖励iPhone XS max");
            } else if (number > 60 && number <= 80) {
                System.out.println("奖励iPad");

            } else {
                System.out.println();
            }
            if (number == 0) {
                System.out.println("完成退出");
                break;
            }
        }
         */

//        //分别输入三个整数，使用if-else排序
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("输入第一个整数");
//        int a = scanner.nextInt();
//        System.out.println("输入第二个整数");
//        int b = scanner.nextInt();
//        System.out.println("输入第三个整数");
//        int c = scanner.nextInt();
//        if (a >= b) {
//            if (c >= a) {
//                System.out.println(b + "," + a + "," + c);
//            } else if (c <= b) {
//                System.out.println(c + "," + b + "," + a);
//            } else {
//                System.out.println(b + "," + c + "," + a);
//            }
//        }else {
//            if (c >= b) {
//                System.out.println(a + "," + b + "," + c);
//            } else if (c <= a) {
//                System.out.println(c + "," + a + "," + b);
//            } else {
//                System.out.println(a + "," + c + "," + b);
//            }
//        }
//
//        //狗的前两年每一年相对于人类的10.5岁，之后每一年就增加4岁。那么5岁的狗相对于人类多少岁。
//        while (true) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("输入狗狗多少岁");
//            int dogAge = scanner.nextInt();
//            double peopleAge = 0;
//            if (dogAge > 0 && dogAge <= 2) {
//                peopleAge = dogAge * 10.5;
//
//            } else {
//                peopleAge = 21 + (dogAge - 2) * 4;
//            }
//            System.out.println(dogAge + "岁的狗相对于人" + peopleAge + "岁");
//        }
        //生成10-99的整数，公式：[a,b],（int）(Math.random()*(b-a+1))+a
//            int value = (int)(Math.random()*90+10);
//            System.out.println(value);
        //高富帅的选择
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入你的身高（cm）");
//        int high = scanner.nextInt();
//        System.out.println("请输入你的财富（千万）");
//        double waelth = scanner.nextDouble();
//        System.out.println("请输入你是否帅否（yes/no）");
////        boolean isHandsome = scanner.nextBoolean();
//        String isHandsome = scanner.next();
//        if (high >= 180 && waelth >= 1 && isHandsome.equals("yes")) {
//            System.out.println("我一定要嫁给他");
//        } else if (high >= 180 || waelth >= 1 || isHandsome.equals("yes")) {
//            System.out.println("比上不足，不上有余，嫁吧");
//        } else {
//            System.out.println("不嫁不嫁！");
//        }
        //

    }
}
