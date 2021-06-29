package com.study;

import java.util.Stack;

public class test8_2 {
    public static int[] solution(int[] prices){
        int[] answer = new int[prices.length];

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i< prices.length; i++){
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]){
                answer[stack.peek()] = i - stack.peek();
                stack.pop(); // 답을 구했기 때문에 stack에서 제거한다.
            }
            // stack이 비어있을 경우 추가
            stack.push(i);
        }

        // 값을 구하지 못한 index = 끝까지 가격이 떨이지지 않은 주식
        while (!stack.isEmpty()){
            answer[stack.peek()] = prices.length - stack.peek() - 1;
            stack.pop();
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] prices = {3,5,5,4,1};
        System.out.println(solution(prices));
    }
}
