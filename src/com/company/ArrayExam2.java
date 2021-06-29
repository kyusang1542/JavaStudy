package com.company;

public class ArrayExam2 {
    //2차원 배열
    public static void main(String[] args){
        // 각각 크기가 같은 2차원 배열을 만듦
        int[][] array4 = new int[3][4];
        array4[0][1] = 10;

        // 각각 크기가 다른 2차원 배열도 만들 수 있다.
        int[][] array5 = new int[3][];
        array5[0] = new int[1];
        array5[1] = new int[2];
        array5[2] = new int[3];
        array5[0][0] = 10;

        int[][] array6 = {{1},{1,2},{1,2,3}};
        System.out.println(array6[0][0]);
        System.out.println(array6[2][2]);

        int [][] array = {{1}, {1, 2}, {1, 2, 3}, {1, 2, 3, 4}};

        // 2차원 배열 array를 출력합니다.
        for(int i = 0 ; i < array.length; i++) {
            System.out.print( (i+1) + "번째 줄을 출력합니다>");
            for(int j = 0; j< array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
