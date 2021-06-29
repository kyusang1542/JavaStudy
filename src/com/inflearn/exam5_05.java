package com.inflearn;

import java.util.Scanner;
import java.util.Stack;

public class exam5_05 {
    public static int solution(String word){
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i)=='(')
                stack.push('(');
            else {
                stack.pop();
                if(word.charAt(i-1)=='(')
                    answer+=stack.size();
                else
                    answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String word = kb.next();
        System.out.println(solution(word));
    }
}
