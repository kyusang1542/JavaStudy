package com.study;

import java.util.HashMap;

public class code01 {
    public static String solution(String[] param0){
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i< param0.length; i++){
            int tmp = param0[i].lastIndexOf("/");
            String tmp2 = param0[i].substring(tmp+1);
            String fileName = "";
            for(int j=0; j<tmp2.length(); j++){
                if(tmp2.charAt(j)!='_') {
                    fileName += tmp2.charAt(j);
                }else if(tmp2.charAt(j)=='_'){
                    int lastFileNameTmp = tmp2.lastIndexOf(".");
                    fileName += tmp2.substring(lastFileNameTmp);
                    map.put(fileName, map.getOrDefault(fileName,0)+1);
                    break;
                }
            }
            for(int x : map){
                System.out.println(x);
            }

        }

        return answer;
    }
    public static void main(String[] args) {
        String[] answer = {"a/a_v2.x","/b/a.x"};
        System.out.println(solution(answer));
    }
}
