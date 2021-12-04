package com.NBA.JAVA.TestEncaosulation.a;

/*
修饰符     同一个类 同一个包 子类 所有类
private     *
default     *       *
protected   *       *      *
public      *       *      *   *
 */

public class Person {
    private int testprivate;
    int testDefault;
    protected int testProticted;

    public void  test (){
        //同一个类下可以用private
        System.out.println(this.testprivate);
    }
}
