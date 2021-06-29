package com.company;

public class OperatorExam4 {
    // 논리연산자
    public static void main(String[] args){
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;

        System.out.println(b1 && b2);   // and
        System.out.println(b1 && b3);
        System.out.println(b1 || b2);   // or
        System.out.println(b1 || b3);
        System.out.println(b2 || b2);

        System.out.println("---------------");

        int score = 88;
        if(score <= 100 && score >= 70){
            System.out.println("성공");
        }else {
            System.out.println("실패");
        }

        System.out.println("---------------");

        // 모두 true or false 이면 false
        // true false 혹은 false true이면 true
        System.out.println(b1 ^ b3);
        System.out.println(b1 ^ b2);
        // true는 false, false는 true를 return
        System.out.println(!b1);
    }
}
