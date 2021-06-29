package com.company;

// 패키지 위치가 다르기 떄문에 import가 되었음을 확인 할 수 있음
import com.javastudy.Hello;

public class HelloExam {
    public static void main(String[] args){
        Hello hello = new Hello();
        // 임포트를 하지 않고 다음과 같이 사용할 수 있음
        com.javastudy.Hello hello1 = new com.javastudy.Hello();
    }
}
