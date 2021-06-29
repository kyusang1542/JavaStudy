package com.inflearn;

import java.util.Scanner;
import java.util.Stack;

public class exam5_02 {
    public static String solution(String word){
        String answer = "";

        Stack<Character> stack = new Stack<>();

        for(char c : word.toCharArray()){
            stack.push(c);
            if(stack.peek()==')'){
                while (stack.pop()!='(');
            }
        }

        for(char x : stack){
            answer += x;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String word = kb.next();
        System.out.println(solution(word));
    }
}
