package com.company;

// throws 에러 처리
public class ExceptionExam2 {
    public static void main(String[] args){
        int i = 10;
        int j = 0;
        try{
        int k = divide(i, j);
        System.out.println(k);
        }catch (ArithmeticException e){
            System.out.println(e.toString());
        }
    }

    // throws 발생할 Exception 작성 ,를 사용해서 여러 Exception 사용 가능
    // 해당 Exception 발생시 해당 메서드를 호출하는 곳에서 처리 함을 의미
    // (여기서는 divide)
    public static int divide(int i, int j) throws ArithmeticException{
        int k = i/j;
        return k;
    }
}