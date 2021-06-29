package com.company;

public class SwitchExam {
    // switch 문
    public static void main(String[] args){
        //swich, case, default, break

        int value = 2;

        // switch 문은 break; 를 적지 않으면 아래 모든 문장을 실행함을 주의
        switch (value) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("그 외 다른 숫자");
        }

        String str = "A";
        switch (str){
            case "A":
                System.out.println("A");
                break;
            case "B":
                System.out.println("B");
                break;
        }
    }
}
