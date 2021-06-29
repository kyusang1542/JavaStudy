package com.company;

// 내부 클래스2
// 정적 중첩 클래스 또는 스태틱 클래스
public class InnerExam2 {
    static class Cal{
        int value = 0;
        public void plus(){
            value++;
        }
    }
    public static void main(String[] args){
        InnerExam2.Cal cal = new InnerExam2.Cal();
        cal.plus();
        System.out.println(cal.value);
    }
}
