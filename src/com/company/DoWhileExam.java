package com.company;

import java.util.Scanner;

public class DoWhileExam {
    //do wihle문
    public static void main(String[] args){

        int value = 0;
        // System.in 은 키보드를 의미함
        // 즉 아래의 의미는 키보드로부터 값을 입력 받는 클래스 Scanner를 의미함
        Scanner scanner = new Scanner(System.in);

        // while문과 다르게 조건 충족 여부와 상관없이 반드시 한 번은 실행 됨
        do{
            // 반복할 문장
            value = scanner.nextInt();
            System.out.println("입력받은 값 : "+value);
        }while(value != 10);

        System.out.println("반복문 종료");
    }
}
