package com.NBA.JAVA;

import java.util.Scanner;
//薪水计算器
public class TestWorkSalary extends Object{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("我的年薪计算器小软件");
        System.out.println("exit退出程序，next计算下一次年薪，输入其他计算年薪");
        while (true) {

            System.out.println("请输入月薪：");
            int monthSalary = scanner.nextInt();
            System.out.println("请输入一年多少个月薪：");
            int moths = scanner.nextInt();
            int yearSlary = monthSalary * moths;
            System.out.println("请输入命令");
            scanner.nextLine();
            String command = scanner.nextLine();
            System.out.println(command + "=========");
            if ("exit".equals(command)) {
                System.out.println("退出程序");
                break;
            }
            if ("next".equals(command)) {
                System.out.println("重新输入新的数据");
                continue;
            }

            if (yearSlary > 100000 && yearSlary < 200000) {
                System.out.println("恭喜你超越90%的国人");
            }
            if (yearSlary >= 200000) {

            } else {
                System.out.println("继续努力");
            }
            System.out.println("年薪是：" + yearSlary);
            System.out.println("恭喜你超过了98%的国人");



        }


    }
}
