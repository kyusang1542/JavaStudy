package com.company;

public class OperatorExam2 {
    // 비교 연산자
    public static void main(String[] args){
        // 단순 대입연산자
        int i = 10;
        int j = 10;

        // 비교 연산자
        System.out.println(i == j);
        System.out.println(i != j);
        System.out.println(i < j);
        System.out.println(i <= j);
        System.out.println(i > j);
        System.out.println(i >= j);

        i += 10; // i = i + 10;
        System.out.println(i);
        System.out.println(i -= 5);
        System.out.println(i);
    }
}
