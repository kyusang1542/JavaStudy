package com.inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class exam2_06 {
    public static ArrayList<Integer> solution(int num, int[] ch){
        ArrayList<Integer> answer = new ArrayList<>();

        boolean primeSwitch = true;

        for(int i=0; i<num; i++){
            // 숫자를 뒤집음
            int result = 0;
            while (ch[i]!=0){
                result = result * 10 + ch[i] % 10;
                ch[i] /= 10;
            }
            ch[i] = result;
            //System.out.print(ch[i]+" ");

            // 소수인지 확인
            if(ch[i]!=1){
                for(int j=2; j<ch[i]; j++){
                    if(ch[i]%j == 0){
                        primeSwitch = false;
                        break;
                    }
                    else{
                        primeSwitch = true;
                    }
                }
                if(primeSwitch == true)
                    answer.add(ch[i]);
                primeSwitch = true;
            }
        }
        //System.out.println();
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[] ch = new int[num];
        for(int i=0; i<num; i++){
            ch[i] = kb.nextInt();
        }
        for(int x : solution(num, ch)){
            System.out.print(x+" ");
        }
    }
}
