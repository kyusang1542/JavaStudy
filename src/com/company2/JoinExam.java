package com.company2;

// 쓰레드와 상태제어(join)
public class JoinExam {
    public static void main(String[] args) {
        MyThread5 thread = new MyThread5();
        thread.start();

        System.out.println("시작");

        try {
            // 해당 쓰레드가 모두 끝날때까지 기다림
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("종료!");
    }
}
