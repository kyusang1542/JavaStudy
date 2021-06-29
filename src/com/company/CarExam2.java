package com.company;

public class CarExam2 {
    // 생성자
    public static void main(String[] args){
        Car c1 = new Car();
        Car2 c2 = new Car2("소방차");
        Car2 c3 = new Car2("구급차");

        System.out.println(c2.name);
        System.out.println(c3.name);

    }
}
