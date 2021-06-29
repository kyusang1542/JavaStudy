package com.company;

public class ArrayExam {
    // 1차원 배열
    public static void main(String[] args){
        // 배열은 변수가 아닌 참조형 타입임에 주의
        // 배열은 실제로는 다른 곳을 참조하고 있음
        int[] array1 = new int[100];

        array1[0] = 50;
        array1[10] = 100;

        int[] array2 = new int[]{1,2,3,4};
        int[] array3 = {1,2,3,4};

        System.out.println(array3[3]);

        int value = array3[0];
        System.out.println(value);

    }
}
