package com.study;

public class TestNote2 {
    public static void main(String[] args) {

        int n = 10;

        String[] num = {"4", "1", "2"};
        String answer = "";

        while (n>0){
            answer = num[n % 3] + answer;
            n = (n-1) / 3;
        }

        System.out.println(answer);
    }
}
