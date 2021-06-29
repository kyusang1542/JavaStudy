package com.company2;

// 동기화 메소드와 동기화 블록
public class MusicPlayer2 extends Thread{
    int type;
    MusicBox2 musicBox;

    public MusicPlayer2(int type, MusicBox2 musicBox){
        this.type = type;
        this.musicBox = musicBox;
    }

    @Override
    public void run() {
        switch (type){
            case 1:
                musicBox.playMusicA();
                break;
            case 2:
                musicBox.playMusicB();
                break;
            case 3:
                musicBox.playMusicC();
                break;
        }
    }
}
