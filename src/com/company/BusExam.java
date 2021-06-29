package com.company;

public class BusExam {
    public static void main(String[] args){
        Bus bus = new Bus();
        // 자식은 부모가 가진것을 물려받아 사용 할 수 있다.
        bus.run();
        bus.ppangppang();

        Car3 car = new Car3();
        car.run();

        //부모는 자식의 소스를 사용 할 수 없다.
        //car.ppangppang();
    }
}
