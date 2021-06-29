package com.inflearn;

import java.util.Scanner;

public class exam1_01 {
    public static int solution(String str, char c){
        int answer = 0;

        String changeStr = "";
        char changC = 0;

        changeStr = str.toLowerCase();
        changC = Character.toLowerCase(c);

        int count = 0;

        /*
        for(int i=0; i<str.length(); i++){
            if(changeStr.charAt(i) == changC)
                count++;
        }
         */
        // enum은 배열형식밖에 사용을 할 수 없는 단점이 있음
        // 때문에 String은 해당 방식을 사용 할 수 없는데 아래와 같이 toCharArray()를 이용하면 가능
        // String을 배열처럼 하나씩 분리해서 보내줌
        for(char x : changeStr.toCharArray())
            if(x==changC)
                count++;

        answer = count;

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.println(solution(str, c));
    }
}
