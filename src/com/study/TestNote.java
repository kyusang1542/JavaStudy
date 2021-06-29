package com.study;

import java.util.*;

public class TestNote {
    static void draw1(int h){
        if (h==0){
            return;
        }
        draw1(h-1);
        for(int i=0; i<h;i++){
            System.out.print("+");
        }
        System.out.println();
    }
    static void draw2(int h){
        for (int o = 0; o<h; o++){
            for(int i=0; i<o; i++){
                System.out.print("+");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        draw1(5);
        draw2(5);
    }
}
