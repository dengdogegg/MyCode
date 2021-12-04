package com.NBA.JAVA.TestEncaosulation;

public class TestJavaBean {
    private String name;
    private int age;
    private boolean flag;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age<0||age>150){
            System.out.println("输入不合法");
        }else {
            this.age = age;
        }
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isFlag() {
        return flag;
    }

    public static void main(String[] args) {

    }
}
