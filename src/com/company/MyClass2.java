package com.company;

public class MyClass2 {
    // 메소드 오버로딩
    // MethodOverloadExam에 사용
    // 매개변수의 수, 타입이 다른 경우
    // 동일한 이름으로 메소드 여러개를 정의 할 수 있다.

    public int plus(int x , int y){
        return x + y;
    }

    public int plus(int x, int y, int z){
        return x + y + z;
    }

    public String plus(String x, String y){
        return x + y;
    }

}
