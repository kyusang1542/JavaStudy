package com.company2;

import java.lang.reflect.Method;

public class MyHelloExam {
    public static void main(String[] args) {
        MyHello hello = new MyHello();

        // getClass는 인스턴스를 만들때 사용한 클래스의 정보를 리턴하게 됨
        // 그 클래스에 대한 정보를 얻고 hello라는 메소드에 대한 정보를 구하라 라는 의미
        try {
            Method method = hello.getClass().getDeclaredMethod("hello");
            // isAnnotationPresent는 특정 어노테이션이 메소드에 적용이 되어 있는지 알아내는 구문
            // 즉 method가 Count100 어노테이션을 적용을 하고 있는지 확인을 하고 있음
            // 적용이 되어있다면 true를 반환
            if(method.isAnnotationPresent(Count100.class)){
                // 해당 어노테이션이 적용이 되어있다면 hello 메소드를 100번 실행
                for(int i = 0; i < 100; i++){
                    hello.hello();
                }
            }else{
                // 해당 어노테이션이 적용이 되어있지 않다면 hello 메소드를 1번 실행
                hello.hello();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
