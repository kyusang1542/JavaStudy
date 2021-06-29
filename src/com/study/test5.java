package com.study;

import java.util.ArrayList;
import java.util.Stack;

public class test5 {

    public static int[] solution(int[] progresses, int[] speeds){
        Stack<Integer> stack = new Stack<>();

        // 몇번을 해야 작업이 완료되는지 횟수를 구하여 Stack에 push를 해줌
        for(int i = progresses.length-1; i >= 0; i--){
            // (100 - 55) / 5 + ((100 - 55) % 5 > 0 ? 1 : 0 ));
            // 45 / 5 + (45 % 5 > 0 ? 1 : 0)
            // 9 + 0
            // 9
            stack.push((100 - progresses[i])
                    / speeds[i] + ((100 - progresses[i]) % speeds[i] > 0 ? 1 : 0));
            System.out.println("stack.peek : " + stack.peek());
        }

        ArrayList<Integer> result = new ArrayList<>();

        while (!stack.isEmpty()){
            int cnt = 1;
            int top = stack.pop();

            while (!stack.isEmpty() && stack.peek() <= top){
                cnt++;
                stack.pop();
            }
            result.add(cnt);
        }

        int[] answer = new int[result.size()];

        for(int i=0 ; i<result.size(); i++){
            answer[i] = result.get(i);
        }

//        int top = 0;
//        int count = 1;
//
//        for(int i = 0; i<stack.size(); i++){
//            top = stack.pop();
//            if(top >= stack.peek()) {
//                count++;
//                stack.pop();
//            }
//            result.add(count);
//            count = 1;
//            System.out.println(result.get(i));
//        }


//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());


        return answer;
    }

    public static void main(String[] args) {
        int[] progresses = {95,90,99,99,80,99};
        int[] speeds = {1,1,1,1,1,1};
        System.out.println(solution(progresses, speeds)[0]);
        System.out.println(solution(progresses, speeds)[1]);
        System.out.println(solution(progresses, speeds)[2]);
    }
}
