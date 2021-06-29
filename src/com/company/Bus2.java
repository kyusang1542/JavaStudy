package com.company;

public class Bus2 extends Car5{
    public void run(){
        // super 키워드를 사용하여 자식 클래스에서 부모클래스의 메소드 호출
        super.run();
        System.out.println("Bus의 run 메소드");
    }
}
