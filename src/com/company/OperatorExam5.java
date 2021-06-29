package com.company;

public class OperatorExam5 {
    // 삼항연산자
    public static void main(String[] args){
        // 5 > 4 true 이면 50 거짓이면 40을 b1에 대입
        int b1 = (5 > 4) ? 50 : 40;

        System.out.println(b1);

        int b2 = 0;
        if(5 > 4){
            b2 = 50;
        }else {
            b2 = 40;
        }

        System.out.println(b2);

        // 삼항연산자는 if 문과 비슷하다.
    }
}
