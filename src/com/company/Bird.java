package com.company;

// 추상클래스
// 추상클래스는 반드시 abstract를 붙여주어야 함
public abstract class Bird {
    // abstract 추상클래스 라는 것을 의미
    public abstract void sing();
    public void fly(){
        System.out.println("날다.");
    }
}
