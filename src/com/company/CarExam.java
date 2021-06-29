package com.company;

public class CarExam {
    // 객체 생성
    public static void main(String[] args){
        // new Car()를 생성자라고 부름
        // 이런 생성자를 통해서 메모리에 객체를 만들라는 명령임
        // 앞 부분의 c1과 c2는 객체를 의미하고 Car는 클래스를 의미함
        Car c1 = new Car();
        Car c2 = new Car();

        c1.name = "소방차";
        c1.number = 1234;

        c2.name = "구급차";
        c2.number = 1111;

        System.out.println(c1.name);
        System.out.println(c1.number);

        System.out.println(c2.name);
        System.out.println(c2.number);
    }
}
