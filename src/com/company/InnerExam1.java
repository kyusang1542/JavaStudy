package com.company;

// 내부 클래스1
// 중첩 클래스 또는 인스턴스 클래스
public class InnerExam1 {
    class Cal{
        int value = 0;
        public void plus(){
            value++;
        }
    }
    public static void main(String[] args){
        InnerExam1 t = new InnerExam1();
        InnerExam1.Cal cal = t.new Cal();
        cal.plus();
        System.out.println(cal.value);
    }
}
