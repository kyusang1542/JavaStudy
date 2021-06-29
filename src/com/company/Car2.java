package com.company;

// CarExam2의 클래스
// 생성자 선언
public class Car2 {
    // 타입 필드명;
    String name;
    int number;

    // 유형1
    // public 클래스명(매개변수 목록){} //생성자 블록
    public Car2(String name){
        // this는 객체 자신을 참조하는 키워드 여기서는 필드 name을 가르키게 됨
        this.name = name;
    }

    // 유형2
    // public 리턴타입 메소드명(매개변수 목록){}


    // 기본 생성자
    public Car2(){
//        this.name = "이름없음";
//        this.number = 0;
        this("이름없음",0); // 자신의 생성자를 호출함 아래 28번째 줄 호출
    }

    public Car2(String name, int number){
        this.name = name;
        this.number = number;
    }
}
