package com.NBA.JAVA;

//测试多态，同一个方法调用，由于对象不同肯会有不同的行为,方法的多态
public class TestPolymorphism {
    static void  AnimalShout(Animal a){
        a.shout();
    }



    public static void main(String[] args) {
        Animal a = new Cat();
        Animal b = new Dog();
        Animal c = new pig();
        AnimalShout(a);
        AnimalShout(b);
        AnimalShout(c);
    }
}

class Animal {
    public void shout() {
        System.out.println("叫了一声");
    }

}

class Dog extends Animal {
    @Override
    public void shout() {
        System.out.println("汪汪汪");
    }
}

class Cat extends Animal {
    @Override
    public void shout() {
        System.out.println("喵喵喵");
    }
}

class pig extends Animal {
    @Override
    public void shout() {
        System.out.println("啧啧啧");
    }
}
