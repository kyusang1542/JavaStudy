package com.company;

public class OperatorExam3 {
    // 연산자 우선 순위
    public static void main(String[] args){
        int a = 5;
        int b = 10;
        int c = 15;

        System.out.println((a - b) * c);

        System.out.println(a > 5 && b > 5); // &&는 and를 의미함

        System.out.println(a > 5 || b > 5); // ||는 or를 의미함

        System.out.println(++a - 5);
        System.out.println(a);

        System.out.println(a-- - 5);
        System.out.println(a);
    }
}
