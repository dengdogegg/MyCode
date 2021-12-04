package com.NBA.JAVA;

import java.util.Objects;

public class TestEquals extends TestNBA {
    int id;
    String name;
    double high;

    public TestEquals(int id, String name, double high) {
        this.id = id;
        this.name = name;
        this.high = high;
    }

    public TestEquals(int id) {
        this.id = id;
    }
    //return的作用：返回值，结束方法的运行
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestEquals that = (TestEquals) o;
        return id == that.id &&
                Double.compare(that.high, high) == 0 &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public TestEquals() {
    }

    public static void main(String[] args) {
        TestEquals curry = new TestEquals(1, "Curry", 1.88);
        TestEquals james = new TestEquals(2, "James", 2.03);
        TestEquals curry_id = new TestEquals(1);
        TestEquals james_id = new TestEquals(1);
        System.out.print(curry.name);
        shoot();
        System.out.print(curry.name);
        curry.Dunk();
        System.out.println(curry);
        System.out.println(james.toString());   //打印类+方法+@+内存地址的哈希值，同上面一条语句
        System.out.println(curry == james);   //判断是不是同一个对象
        System.out.println(curry_id.equals(james_id));   //判断值是否相等


    }
}
