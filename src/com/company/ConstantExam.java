package com.company;

public class ConstantExam {
    // 상수(한 번 정해지면 변해지지 않는 값)
    public static void main(String[] args){
        // 변수
        int i;
        i = 10;
        i = 5;

        // 상수
        // 상수는 모두 대문자로만 구성된 명사를 사용하는 것이 관례이다.
        // 단어와 단어 사이에는 _ (언더바)를 붙여서 사용한다.
        final int J;
        J = 10;
//        J = 5;  불가능

        // 예시 1 ( PI 값은 절대 변하지 않으므로 상수 값으로 지정)
        double circleArea;
        final double PI = 3.14159;
        circleArea = 3 * 3 * PI;

        // 예시 2
        final int OIL_PRICE = 1450;
        int totalPrice = 50 * OIL_PRICE;
    }
}
