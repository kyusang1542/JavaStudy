package com.inflearn;

import java.util.*;

public class exam5_08 {

    static class Person{
        int id;
        int priority;
        public Person(int id, int priority){
            this.id = id;
            this.priority = priority;
        }
    }

    public static int solution(int num1, int num2, int[] human){
        int answer = 0;

        Queue<Person> queue = new LinkedList<>();
        for(int i=0; i<num1; i++){
            queue.offer(new Person(i, human[i]));
        }

        while (!queue.isEmpty()){
            // 일단 앞의 한명을 꺼낸다.
            Person tmp = queue.poll();
            // 앞의 한 명을 꺼낸 사람을 다음 사람의 우선 순위와 비교해보고
            // 높지 않다면 뒤로 보내버린다.
            for(Person x : queue){
                if(x.priority> tmp.priority){
                    queue.offer(tmp);
                    tmp=null;
                    break;
                }
            }
            // 순서가 맞아 진료를 보면 (순서가 맞다면 위에서 if문에 걸리지 않으므로
            // tmp가 null이 아닌 다른 값이 들어있다.)
            // 카운트를 올려준다.
            if(tmp!=null){
                answer++;
                // 만약 진료를 받은 사람이 입력한 진료 순서 num2와 같은 숫자라면 answer을 그대로 리턴한다.
                if(tmp.id==num2)
                    return answer;
            }
        }


        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num1 = kb.nextInt();
        int num2 = kb.nextInt();
        int[] human = new int[num1];
        for(int i=0; i<num1; i++){
            human[i] = kb.nextInt();
        }
        System.out.println(solution(num1, num2, human));
    }
}
