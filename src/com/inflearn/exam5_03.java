package com.inflearn;

import java.util.Scanner;
import java.util.Stack;

public class exam5_03 {
    public static int solution(int num, int[][] board, int M, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for (int pos : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][pos - 1] != 0) {
                    int tmp = board[i][pos - 1];
                    board[i][pos - 1] = 0;
                    if (!stack.isEmpty() && tmp == stack.peek()) {
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.push(tmp);
                    }
                    break;
                }
            }
        }

        return answer;

        /*
        int pop = -1;
        int set=0;
        for(int i=0; i<M; i++){
            while (true){
                if(set>4){
                    set = 0;
                    break;
                }else if(board[set][moves[i]-1]==0){
                    set++;
                }else {
                    stack.push(board[set][moves[i]-1]);
                    board[set][moves[i]-1] = 0;
                    set = 0;
                    break;
                }
            }
            if(pop==stack.peek()){
                answer += 2;
                stack.pop();
                stack.pop();
            }else{
                pop=stack.peek();
            }
        }

        return answer;
        */
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[][] board = new int[num][num];
        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                board[i][j] = kb.nextInt();
            }
        }
        int M = kb.nextInt();
        int[] moves = new int[M];
        for(int i=0; i<M; i++){
            moves[i]=kb.nextInt();
        }
        System.out.println(solution(num, board, M, moves));
    }
}
