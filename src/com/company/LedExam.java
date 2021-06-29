package com.company;

// 인터페이스 사용하기
public class LedExam {
    public static void main(String[] args){
        // 참조 변수의 타입으로 인터페이스를 사용 할 수 있음
        // 인터페이스가 가지고 있는 메서드만 사용 할 수 있다.
        TV tv = new LedTV();
        tv.turnOn();
        tv.changeChannel(8);
        tv.changeVolume(39);
        tv.turnOff();
    }
}
