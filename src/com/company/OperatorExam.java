package com.company;

public class OperatorExam {
    // 산술 연산자
    public static void main(String[] args){
        int i1 = -5;
        int i2 = +i1;   // 현재 부호를 그대로 유지해줌
        int i3 = -i1;   // 현재 부호를 변환해줌 -는 +로, +는 -로

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        System.out.println("-----------------");

        int i4 = ++i3;  // i3 = i3+1;   // i3+1을 한 후 i4에 대입
        System.out.println(i4);     // i3의 값에서 1을 더한 값
        System.out.println(i3);     // ++i3이 연산되어서 하나가 증가되었음
        int i5 = i3++;  // i3 = 13+1;   // i3을 i4에 대입 후 i3+1
        System.out.println(i5);     // i3값이 i5값에 그대로 들어감
        System.out.println(i3);     // i3++으로 하나가 증가되었음

        System.out.println("-----------------");

        int i = 5;
        int j = 2;
        System.out.println(i + j);
        System.out.println(i - j);
        System.out.println(i * j);
        System.out.println(i / j);  // int (정수) 이기 때문에 2.5가 아닌 2가 나옴
        System.out.println(i / (double)j);  // 실수 값을 구함
        System.out.println(i % j);  // 나머지 값을 구함
    }
}
