package com.myStudy.ago;

/*
变量的使用：
1.java定义变量的格式：数据类型 变量名= 变量值；
2说明：
a.变量必须先声明后赋值使用
b.变量都定义在其作用域内，它是有效的
c.同一个作用域内不能声明同名的变量
 */
public class day01 {
    public static void main(String[] args) {
        int myage = 12;
        System.out.println(myage);

//        String myname;
//        System.out.println(myname);
/*
数据类型
基本数据类型：
数值型-整数型byte1字节 short2字节 int4字节 long8字节,浮点型float4字节 double8字节
字符型 char
布尔型 boolean
引用数据类型
类 class（包括字符串 枚举）
接口 interface
数组跑[]
 */
        long l1=1234L;  //long声明必须以l或L结尾
        System.out.println(l1);
        float f1=1324f; //float声明必须以f或F结尾
        System.out.println(f1);
        char a1='c';    //char使用单引号，只能是一个字符，字符串String为""
        System.out.println(a1);
        //  '\t'制表符  '\n'换行符
        char a2='\u0043';   //ASCII字符集
        System.out.println(a2);
        boolean bl=true;    //条件判断、循环使用
        System.out.println(bl);
        if (bl) {
            System.out.println("你真\"帅\"！"); //反斜杠\表示转义符
        }else {
            System.out.println("加油，dengdogegg");
        }
/*
基本数据类型自建的运算规则
前提：7种数据类型，不包含Boolean
1.自动类型提升：
byte\char\short int long float double依次递增
容量小的数据类型与容量大的数据类型做运算，结果自动提升为容量大的数据类型（表示数的范围）
2.强制类型转换：

 */
        byte b1=2;
        int i1=10;
//        byte b2=b1+i1;    溢出，编译不通过
        int i2=b1+i1;
        System.out.println(i2);
        char a3='a';    //97
        System.out.println(a3+i1);


    }
}
