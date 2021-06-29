package com.company;

public class DuckExam {
    public static void main(String[] args){
        Duck duck = new Duck();
        duck.sing();
        duck.fly();

        // 추상클래스 는 부모로서의 역활은 가능가능하지만
        // 추상클래스 자체를 이용하여 객체를 선언하는 것은 불가능하다.
        // Bird b = new Bird();
    }
}
