package com.company2;

// 동기화 메소드와 동기화 블록
public class MusicBoxExam2 {
    public static void main(String[] args) {
        MusicBox2 box = new MusicBox2();

        MusicPlayer2 kang = new MusicPlayer2(1, box);
        MusicPlayer2 kim = new MusicPlayer2(2, box);
        MusicPlayer2 lee = new MusicPlayer2(3, box);

        kang.start();
        kim.start();
        lee.start();
    }
}
