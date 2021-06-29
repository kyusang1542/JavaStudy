package com.company2;

// 스트링 클래스의 문제점
public class StringExam2 {
    public static void main(String[] args) {
        String str1 = "hello world";
        String str2 = str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);

        String str3 = str1 + str2;
        System.out.println(str3);

        // 실제로 str3의 과정은 str4와 같은 과정을 거침
        String str4 = new StringBuffer().append(str1).append(str2).toString();
        System.out.println(str4);

        // 자바 연산자는 new 연산자가 사용할 수록 느려지는데 아래와 같은 반복문이 실행되면
        // 반복문이 동작 할때마다 new 동작이 발생하여
        // 코드가 굉장히 비효율 적으로 동작하는 문제가 발생함
        String str5 = "";
        for(int i =0; i<100; i++){
            str5 = str5 + "*";
        }
        System.out.println(str5);

        // 위와 같이 String에 계속 더하여 주는 것 보다는 StringBuffer를 선언해주고
        // append 명령어를 통하여 반복문을 실행하여 주고 난 후에 마지막에 String에
        // 대입을 해주는 것이 효율적인 코드이다.
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i<100; i++){
            sb.append("*");
        }
        String str6 = sb.toString();
        System.out.println(str6);

        // 위와같은 이유로 문자열을 반복문 안에서 더하는 것은 성능상 문제가 생길 수 있으니
        // 반드시 피하는 것이 좋다.
    }
}
