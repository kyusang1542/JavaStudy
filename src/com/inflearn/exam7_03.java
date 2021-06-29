package com.inflearn;

public class exam7_03 {
    public static int DFS(int num){
        if(num==1){
            return 1;
        }else {
            return num*DFS(num-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(DFS(5));
    }
}
