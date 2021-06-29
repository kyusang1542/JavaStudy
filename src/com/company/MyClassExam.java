package com.company;

public class MyClassExam {
    // 메소드 사용해보기
    public static void main(String[] args){
        MyClass myClass = new MyClass();

        myClass.method1();

        myClass.method2(10);

        int value = myClass.method3();
        System.out.println("m3이 리턴한 값" + value);

        myClass.method4(10,20);

        int value2 = myClass.method5(10);
        System.out.println("m5이 리턴한 값" + value2);
    }
}
