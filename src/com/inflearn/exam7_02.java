package com.inflearn;

public class exam7_02 {
    public static void DFS(int num){
        if(num==0){
            return;
        }else {
            DFS(num/2);
            System.out.print(num%2+" ");
        }

    }
    public static void main(String[] args) {
        DFS(11);
    }
}
