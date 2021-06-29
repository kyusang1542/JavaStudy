package com.company;

public class ForExam {
    // for 문
    public static void main(String[] args){
        int total = 0;
        for(int i=1; i<=100; i++){
            if(i % 2 != 0){
                // continue는 아래쪽을 실행하지 않고 반복문으로 올라가서 다시 실행시킴
                // 최종적으로 짝수의 합만 결과를 얻게 됨
                continue;
            }
            total = total + i;
        }
        System.out.println(total);

        total = 0;
        for(int i=1; i<=100; i++){
            if(i == 50){
                // 반복문을 빠져나감
                break;
            }
            total = total + i;
        }
        System.out.println(total);
    }
}
