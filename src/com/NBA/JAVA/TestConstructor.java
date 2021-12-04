package com.NBA.JAVA;

class Point{
    double x,y;
    //1.带参数构造器
    // 2.创建构造器后系统不会创建不带参数的构造器，需要自己创建；
    public Point( double _x,double _y){
        x=_x;
        y=_y;
    }
    public double getDistance(Point p){
        //x,y为p对象的值,p.x,p.y为对象origin的值
        return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
    }
}


public class TestConstructor {
    public static void main(String[] args) {
        Point p = new Point(3,4);
        Point origin = new Point(0,0);
        //p对象调用getDistance，Point p为形参，origin为实参
        System.out.println(p.getDistance(origin));
    }


}
