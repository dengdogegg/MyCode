package com.NBA.JAVA;

public class TestMethod {
    //方法定义
    public static void loveU(int i){    //i为形式参数
        System.out.println("I Love You");
        System.out.println("520");
        System.out.println("我爱你");
        System.out.println("爱老虎油"+"爱你"+i+"年");
    }
/*
形式参数：在方法声明时用于接收外传入的参数，
实参：调用方法时实际传给方法的数据，
返回值：方法在执行完毕后返还给调用它的环境数据，
返回值类型：事先约定的返回值的数据类型，如没有返回值，必须显示指定的为void。
注意细节
实参的数目、数据类型和次序必须和所调用的方法声明的形式参数列表匹配，
return 为语句终止方法的运行并指定要返回的数据，

 */
    public  static int add(int a,int b ,int c ){
        int sum= a+b+c;
        return sum;
    }


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            loveU(10000);    //方法调用，10000为实际参数
            System.out.println(add(199, (int) 2.0, (int) 3.0));
        }


    }
}
