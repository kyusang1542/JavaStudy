package com.company;

// 예외 처리
public class ExceptionExam {
    public static void main(String[] args){
        int i = 10;
        int j = 0;

        try {
            int k = i / j;
            System.out.println(k);
        }catch (ArithmeticException e){
            // 예외클래스변수명.toString() 예외의 정보를 알려주는 메소드
            System.out.println("0으로 나눌 수 없습니다." + e.toString());
        }finally {
            System.out.println("오류가 발생했든 발생하지 않았든 무조건 실행!!");
        }
        System.out.println("main end!!");

        /*
        // 수행할 코드, 예외 발생 가능성이 있는 블록
        try{

        // 예외 처리 블록
        // catch 블록은 여러개 사용이 가능하다.
        // 예외클래스 Exception -> 모든 오류 처리하는 예외 클래스
        }catch (예외외클래스 변수명){

        // 예외 발생 여부에 상관없이 반드시 실행되는 블록 (생략 가능)
        }finally {

        }
        */
    }
}
