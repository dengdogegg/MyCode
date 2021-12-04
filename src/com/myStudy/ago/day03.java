package com.myStudy.ago;

import java.util.Scanner;

/*测试switch case*/
public class day03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        fourSeasons();
//        UpperAndLower(scanner);
//        PerformanceJudgment(scanner);
//        YearMonthDay(scanner);
//        EvenSumOf100();
//        foobizbaz();
//        CommonMultipleCommonDivisor(scanner);
//        NumberOfDaffodils();
//        evenOf100();
//        positiveTriangle();
//        InvertedTriangle();
//        NineNineMultiplicationTable();

        PrimeNumber();
    }

    private static void PrimeNumber() {
        long bingin = System.currentTimeMillis();

        for (int i = 2; i <= 100000; i++) {    //遍历100以内的数
            //100以内的质数
            boolean isflag = true;
            for (int j = 2; j <=Math.sqrt(i); j++) {   //j:被i去除
                if (i % j == 0) {
                    isflag = false;
                    break;  //优化1，只对本身非质数的自然数是有效的
                }
            }
            if (isflag == true) {
                System.out.println(i);
            }

        }
        long end = System.currentTimeMillis();
        long times = end - bingin;
        System.out.println(times);
        //未加break,15439;加break,1429;加break且开方i,89
    }

    //春夏秋冬
    private static void fourSeasons() {

        String season = "summer";
        switch (season) {
            case "spring":
                System.out.println("春暖花开");
                break;
            case "summer":
                System.out.println("夏日炎炎");
                break;
            case "autumn":
                System.out.println("秋高气爽");
                break;
            case "winter":
                System.out.println("冬雪皑皑");
                break;
            default:
                System.out.println("输入的季节有误");
                break;
        }
    }

    //测试小写字母转换大写字母
    private static void UpperAndLower(Scanner scanner) {
        while (true) {
            System.out.println("请输入小写字母");
            String word = scanner.next();
            switch (word) {
                case "a":
                    System.out.println("A");
                    break;
                case "b":
                    System.out.println("B");
                    break;
                case "c":
                    System.out.println("C");
                    break;
                case "d":
                    System.out.println("D");
                    break;
                case "e":
                    System.out.println("E");
                    break;
                default:
                    System.out.println("other");
            }
        }
    }

    //大于等于60“合格”否则不合格
    private static void PerformanceJudgment(Scanner scanner) {
        System.out.println("请输入一个1-100的分数");
        int score = scanner.nextInt();
        switch (score / 10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不及格");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("及格");
                break;
            default:
                System.out.println("请正确输入分数");
        }
    }

    //键盘输入2021年的month和day,输出这年的第几天
    private static void YearMonthDay(Scanner scanner) {
        System.out.println("请输入2021年的月份");
        int month = scanner.nextInt();
        System.out.println("请输入2021年的日期");
        int day = scanner.nextInt();
        int sumDays = 0;
        switch (month) {
            case 12:
                sumDays += 30;
            case 11:
                sumDays += 31;
            case 10:
                sumDays += 30;
            case 9:
                sumDays += 31;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 30;
            case 6:
                sumDays += 31;
            case 5:
                sumDays += 30;
            case 4:
                sumDays += 31;
            case 3:
                sumDays += 28;
            case 2:
                sumDays += 31;
            case 1:
                sumDays += day;
        }
        System.out.println("2021年" + month + "月" + day + "日是这年的第" + sumDays + "天");
    }

    //使用循环输入100以内的偶数,输出和
    private static void EvenSumOf100() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
//                System.out.println(i);
                sum += i;
            }

        }
        System.out.println(sum);
    }

    //编写1到150，打印每一行，3的倍数输出foo,5的倍数输出biz,7的倍数输出baz
    private static void foobizbaz() {
        for (int j = 1; j <= 150; j++) {
            System.out.print(j);
            if (j % 3 == 0) {
                System.out.print(" " + "foo" + " ");
            }
            if (j % 5 == 0) {
                System.out.print(" " + "biz" + " ");
            }
            if (j % 7 == 0) {
                System.out.print(" " + "baz" + " ");
            }
            System.out.println();
        }
    }

    //        输入两个正整数，输出最大公约数和最小公倍数
    private static void CommonMultipleCommonDivisor(Scanner scanner) {
        System.out.println("输入第一个正整数");
        int n = scanner.nextInt();
        System.out.println("输入第二个整整数");
        int m = scanner.nextInt();
        int min = (m > n) ? n : m;
        for (int i = min; i >= 1; i--) {
            if (m % i == 0 && n % i == 0) {
                System.out.println("最大公约数为" + i);
                break;
            }

        }
        int max = (m > n) ? n : m;
        for (int i = max; i <= m * n; i++) {
            if (i % m == 0 && i % n == 0) {
                System.out.println("最小公约数为" + i);
                break;
            }
        }
    }

    //水仙花数：三位数的各个位数立方和为该数
    private static void NumberOfDaffodils() {
        for (int i = 100; i < 1000; i++) {
            int bai = i / 100;

            int shi = (i - bai * 100) / 10;
            int ge = i % 10;
            if (i == Math.pow(bai, 3) + Math.pow(shi, 3) + Math.pow(ge, 3)) {
                System.out.print("水仙花数为" + i + " ");
                System.out.print("百位数：" + bai + " ");
                System.out.print("十位数：" + shi + " ");
                System.out.println("个位数：" + ge);
            }

        }
    }

    //使用while循环输出100以内的偶数
    private static void evenOf100() {
        int i = 1;
        while (i < 101) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    //嵌套循环输出效果如下
    /*                i行数     j列数
     *       *          1        1
     **         2        2
     ***        3        3
     ****       4        4
     *****      5        5
     */
    private static void positiveTriangle() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
                     i   j
         *****       1   4
         ****        2   3
         ***         3   2
         **          2   3
         *           1   4   */
    private static void InvertedTriangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //九九乘法表
    private static void NineNineMultiplicationTable() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + " ");
            }
            System.out.println();
        }
    }


}

