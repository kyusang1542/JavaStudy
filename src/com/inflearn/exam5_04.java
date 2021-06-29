package com.inflearn;

import java.util.Scanner;
import java.util.Stack;

public class exam5_04 {
    public static int solution(String word){
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for(char x : word.toCharArray()){
            if(Character.isDigit(x)){
                stack.push(Character.getNumericValue(x));
            }else {
                // 스택은 위에서 부터 쌓이는 구조이기 때문에 rt가 먼저 pop이
                // 되야함에 주의 할 것
                int rt = stack.pop();
                int lt = stack.pop();
                if(x=='+'){
                    stack.push(lt+rt);
                }else if(x=='-'){
                    stack.push(lt-rt);
                }else if(x=='*'){
                    stack.push(lt*rt);
                }else if(x=='/') {
                    stack.push(lt / rt);
                }
            }
        }
        answer = stack.pop();

        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String word = kb.next();
        System.out.println(solution(word));
    }
}
