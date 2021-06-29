package com.company2;

// 데몬 쓰레드
// 백그라운드에서 돌아가는 쓰레드
// 모든 쓰레드가 종료되면 강제적으로 종료되는 특징이 있음
public class DaemonThread implements Runnable{

    @Override
    public void run() {
        while (true){
            System.out.println("데몬 쓰레드가 실행중입니다.");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                // 만약 sleep 하는 도중에 에러가 발생할 경우
                // while문을 빠져나가야 하기 때문에 break;
                // 를 넣어준다.
                break;
            }
        }
    }

    public static void main(String[] args) {
        // Thread를 바로 상속받은 것이 아닌 인터페이스 Runnable를
        // 가지고 왔음으로 쓰레드를 선언 후 메소드에 넣어준다.
        Thread thread = new Thread(new DaemonThread());
        // 데몬 쓰레드로 설정을 하기 위해서는 setDaemon(true) 설정
        thread.setDaemon(true);
        thread.start();

        // 메인 클레스가 종료되면 모든 쓰레드가 종료됨으로
        // 데몬 쓰레드도 종료됨을 확인 할 수 있음
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("메인 쓰레드가 종료됩니다.");
    }
}
