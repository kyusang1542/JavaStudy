package com.inflearn;

public class exam7_01 {
    // DFS(재귀함수) 자기가 자기 자신을 호출하는 함수
    public static void DFS(int n){
        if(n==0){
            return;
        } else {
            DFS(n-1);
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        DFS(3);
    }
}
