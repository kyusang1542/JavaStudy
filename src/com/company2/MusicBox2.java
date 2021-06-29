package com.company2;

// 동기화 메소드와 동기화 블록
public class MusicBox2 {
    // synchronized가 붙어있으면 여러개의 쓰레드들이 공유객체의
    // 메서드들을 사용할 때 조금이라도 먼저 실행이 되면
    // 해당 객체의 사용권을 얻게 된다
    // 이 사용권을 보통 모니터링 락 이라고 한다.

    // 추가 설명
    // synchronized 키워드는 여러개의 스레드가 한개의 자원을 사용하고자
    // 할 때, 현재 데이터를 사용하고 있는 해당 스레드를 제외하고 나머지
    // 스레드들은 데이터에 접근 할 수 없도록 막는 개념이다.

    // 메서드에서 synchronized를 거는 경우
    public synchronized void playMusicA(){
        for(int i = 0; i<10; i++){
            System.out.println("신나는 음악!!!");
            try {
                Thread.sleep((int)Math.random()*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void playMusicB(){
        for(int i = 0; i<10; i++){
            System.out.println("슬픈 음악!!!");
            try {
                Thread.sleep((int)Math.random()*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void playMusicC(){
        for(int i = 0; i<10; i++){
            // 객체변수에서 synchronized를 사용하는 경우
            synchronized (this){
                System.out.println("카페 음악!!!");
            }

            try {
                Thread.sleep((int)Math.random()*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
