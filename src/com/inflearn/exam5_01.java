package com.inflearn;

import java.util.Scanner;
import java.util.Stack;

public class exam5_01 {
    public static String solution(String word){
        String answer = "YES";

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) == '(')
                stack.push('(');
            else{
                if(stack.pop()!='('){
                    answer = "NO";
                    break;
                }
            }
        }
        if(!stack.isEmpty())
            answer = "NO";

        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String word = kb.next();
        System.out.println(solution(word));
    }
}
