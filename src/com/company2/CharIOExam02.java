package com.company2;

import java.io.*;

public class CharIOExam02 {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            // 한줄씩 읽기 위해 BufferedReader를 사용
            // File을 읽기위해 FileReader을 사용
            br = new BufferedReader(new FileReader("src/com/company2/CharIOExam02.java"));
            // 파일에 다시 쓰기 위해 PrintWriter를 사용
            pw = new PrintWriter(new FileWriter("test.txt"));
            String line = null;
            // 파일로부터 한줄 입력 받은 내용을 line에 넣는다
            // 파일의 끝에 null값을 리턴한다.
            while ((line = br.readLine())!=null){
                pw.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            pw.close();
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
