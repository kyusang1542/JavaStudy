package com.company2;

// Math
public class MathExam {
    public static void main(String[] args){
        // 두 값중에 더 큰 값을 구할 수 있는 메서드
        int value1 = Math.max(5,30);
        System.out.println(value1);

        // 두 값중에 더 작은 값을 구할 수 있는 메서드
        int value2 = Math.min(5,30);
        System.out.println(value2);

        // 절대값을 구할 수 있는 메서드
        System.out.println(Math.abs(-10));

        // 랜덤한 값을 구해주는 메서드
        // 0아성 1.0 미만의 랜덤한 실수값을 출력한다.
        System.out.println(Math.random());

        // 제곱근을 구해주는 메서드
        System.out.println(Math.sqrt(25));

        System.out.println("2의 10승 = " + Math.pow(2, 10));
        System.out.println("16의 1/2승 = " + Math.pow(16, 0.5));
        System.out.println("log200 = " + Math.log10(200));
    }
}
