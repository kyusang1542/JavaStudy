package com.company2;

// 쓰레드 만들기
public class ThreadExam {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1("*");
        MyThread1 t2 = new MyThread1("-");

        // 쓰레드는 start() 명령어를 만나면 run()을 실행시킨다.
        t1.start();
        t2.start();

        System.out.println("main end !!!");
    }
}
