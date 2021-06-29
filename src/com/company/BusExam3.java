package com.company;

// 클래스 형변환
public class BusExam3 {
    public static void main(String[] args){
        // 부모 타입으로 자식을 가리킬 수 있다.
        // 이 경우 부모가 가지고 있는 내용만 사용 가능
        Car5 c = new Bus3();

        c.run();
        //c.ppangppang();   // 부모가 가지고 있는 내용만 사용 가능하다.

        Bus3 bus = (Bus3)c;
        bus.run();
        bus.ppangppang();
    }
}
