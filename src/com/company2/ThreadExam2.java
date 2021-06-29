package com.company2;

// 쓰레드만들기 implements Runnable
public class ThreadExam2 {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2("*");
        MyThread2 t2 = new MyThread2("-");

        // 쓰래드를 실행하기 위해서는 start() 메소드를 실행해야 하는데
        // MyThread2는 Runnable을 가져와서 사용함으로 start()를 실행 할 수없다
        // 그러므로 실제로 쓰레드를 만든 후 start()를 사용한다.
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        thread1.start();
        thread2.start();

        System.out.println("main end!!!");
    }
}
