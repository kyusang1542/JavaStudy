package com.company2;
// 람다식 기본문법
public class CompareExam {

    public static void exec(Compare compare){
        int k = 10;
        int m = 20;
        int value = compare.compareTo(k, m);
        System.out.println(value);
    }

    public static void main(String[] args) {
        exec(new Compare() {
            @Override
            public int compareTo(int i, int j) {
                return i - j;
            }
        });

        exec((i,j)->{
            return i - j;
        });
    }
}
