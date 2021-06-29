package com.inflearn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exam5_06 {
    public static int solution(int num, int num2){
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<num; i++)
            queue.offer(i+1);

        while (queue.size()!=1){
            for(int i=0; i<num2-1; i++){
                queue.offer(queue.poll());
            }
            queue.poll();
        }
        answer=queue.poll();
        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int num2 = kb.nextInt();
        System.out.println(solution(num, num2));
    }
}
