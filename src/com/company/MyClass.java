package com.company;

public class MyClass {
    // 메소드 선언
    // public 리턴타입 메소드명(매개변수 등) {구현}

    // 리턴 타입이 없을 경우는 void 사용
    public void method1(){
        System.out.println("m1이 실행됨");
    }

    // 매개 변수가 int형
    public void method2(int x){
        System.out.println(x + "를 이용한 m2 실행");
    }

    // 리턴 타입이 int
    public int method3(){
        System.out.println("m3 실행");
        return 10;
    }

    public void method4(int x, int y){
        System.out.println(x + y + " method4 실행");
    }

    public int method5 (int y){
        System.out.println(y + " 이용한 m5 실행");
        return y * 2;
    }
}
