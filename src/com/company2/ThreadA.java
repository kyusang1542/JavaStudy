package com.company2;

public class ThreadA {
    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        b.start();

        synchronized (b) {
            try {
                System.out.println("b가 완료될때까지 기다립니다.");
                // 쓰레드를 대기 상태로 만듦
                // wait()를 만나면 다른 쓰레드가 반드시
                // notify를 만나야지만 깨어남
                // ThreadB의 쓰레드가 종료 되고 notifiy를 만나면
                // wait 상태에서 벗어남
                b.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Total is : " + b.total);
        }
    }
}
