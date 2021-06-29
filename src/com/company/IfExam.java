package com.company;

public class IfExam {
    //if 문
    public static void main(String[] args){
        int x = 50;
        int y = 60;

        if(x < y){
            System.out.println("x는 y보다 작습니다.");
            System.out.println("x는 y보다 작습니다.2");
        }

        // 블럭이 안쳐져있으면 바로 아래줄까지만 조건문으로 인식
        // 실행이 되면 안되는 sout 문까지 실행이 되는 것을 볼 수 있다.
        if(x > y)
            System.out.println("x는 y보다 큽니다.");
        System.out.println("x는 y보다 큽니다.2");

        // 가급적이면 너무 많은 else if 문을 사용하지 않도록 주의 할 것
        // 코드 속도도 느려지고 보기에도 좋지 않음
        if(x == y){
            System.out.println("x는 y와 같습니다.");
        }else if(x < y){
            System.out.println("x는 y보다 작습니다.");
        }else {
            System.out.println("x는 y와 다릅니다.");
        }
    }
}
