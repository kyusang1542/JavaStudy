package com.company;

public class forEachExam {
    // for each문
    // (자바에서는 for문으로 통합해서 사용하지만 다른언어에서는 for each문으로 사용하기
    // 때문에 for each문으로 대부분 부름)
    public static void main(String[] args){
        int[] iarr = {10,20,30,40,50};

        for(int i=0; i< iarr.length; i++){
            int value = iarr[i];
            System.out.println(value);
        }

        System.out.println("----------------");

        // for(타입 값을 받아줄 변수명 : 출력하고 싶은 자료구조)
        for(int value : iarr){
            System.out.println(value);
        }
    }
}
