package com.company;

public class WhileExam {
    public static void main(String[] args){
        int i = 0;

        while (i<10){
            System.out.println(i);
            i++;    // i=i+1;
        }

        System.out.println("-------------");

        int total = 0;
        i = 1;
        while (i<=100) {
            total = total + i;
            i++;
        }
        System.out.println(total);

        System.out.println("-------------");

        i = 0;

        // 무한 반복을 원할 때는 조건문에 true
        while (true){
            System.out.println("무한반복");
            i++;
            if(i==3)
                break; // 무한 반복문을 끝내기 위해 break를 걸어줌
        }
    }
}
