package com.company;

// super와 부모생성자
public class Truck extends Car4{
    public Truck(){

        // 기본생성자에서 String을 받게 바뀌었으므로 다음과 같이
        // super("String"); 을 받도록 수정해준다.
        super("소방차");

        // super 키워드를 추가하지 않아도 자동으로 super();를 추가하여 실행함
        // 즉 부모를 호출함
        // 단 컴파일러는 기본생성자일 경우만 가정을 하기 때문에 기본생성자가 아니라면
        // 별도로 super(객체);를 선언해 주어야 한다.
        // super();    // 부모 객체를 나타내는 키워드드
       System.out.println("Truck의 기본 생성자 입니다.");
    }
}
