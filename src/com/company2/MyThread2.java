package com.company2;

// 쓰레드만들기 implements Runnable
// Runnable 인터페이스를 지원하는 이유는 자바가 단일 상속만 지원하기 때문이다.
// 이미 다른 클래스를 상속 받고 있는 경우에는 쓰래드 클레스를 또 상속 받을 수는
// 없기 때문이다.
public class MyThread2 implements Runnable{

    String str;
    public MyThread2(String str){
        this.str = str;
    }

    @Override
    public void run() {
        for (int i = 0; i<10; i++){
            System.out.println(str);
            try {
                Thread.sleep((int)Math.random()*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
