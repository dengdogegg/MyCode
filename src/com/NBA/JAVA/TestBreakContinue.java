package com.NBA.JAVA;

import sun.nio.cs.ext.MacThai;

//break用于强制退出循环，不再执行剩下的语句
//continue结束本次循环，进行下一次循环
public class TestBreakContinue {
    public static void main(String[] args) {
        //产生100以内的随机数，知道随机数为88终止循环
        int total = 0;   //计时器
        System.out.println("开始");
        while (true) {
            total++;    //每次循环计数器加1
            int i = (int) Math.round(100 * Math.random());    //生成1-100的整型随机数，round四舍五入
            if (i == 88) {
                break;
            }

        }
        System.out.println("Game Over,used" + "\t" + total + "\t" + "times");
        System.out.println();

        //输出100-150之间不能被3整除的数，并且每行输出5个
        total = 0;    //计数器
        for (int i = 100; i <= 150; i++) {
            if (i % 3 == 0) {    //3的倍数跳过这次循环，继续进行下一次循环
                continue;
            }
            System.out.print(i + "\t");   //不是三的倍数，进行输出
            total++;   //每输出一个数加一
            if (total % 5 == 0) {    //判断每行到五个数
                System.out.println();   //每行五个数换行
            }

        }


    }
}
