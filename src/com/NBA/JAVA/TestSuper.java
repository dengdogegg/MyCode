package com.NBA.JAVA;
//super直接对父类对象的引用，访问父类中被子类覆盖的方法与属性，在子类中随便使用。
public class TestSuper {
    public static void main(String[] args) {
        new son().f();
        new SonClass();
    }
}
    class  father{
        public int value;
        public void f(){
            value =100;
            System.out.println("father.value="+value);
        }
    }
    /*
    super()调用父类构造器
    this()调用子类构造器
     */

    class son extends father{
        public int value;
        //方法重写
        public void f(){
            super.f();  //调用父类的方法
            value=200;
            System.out.println("son.value="+value);
            System.out.println(value);
            System.out.println(super.value);    //注意super只能用于子类里面
        }
    }

    class FatherClass{

        public FatherClass() {
            System.out.println("创建父类构造器");
        }
    }

    class  SonClass extends FatherClass{
        public SonClass() {
            //super();编译器自动添加
            System.out.println("创建子类构造器");
        }
    }
