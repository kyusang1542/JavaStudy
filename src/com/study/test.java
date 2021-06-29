package com.study;

import java.util.ArrayList;
import java.util.HashMap;

public class test {

    public static boolean solution(String[] phone_book){
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String number : phone_book){
            hashMap.put(number, 0);
            System.out.println("[key]:  "+number+"  [value]:  "+hashMap.get(number));
        }

        // keySet() key 값만 가져올 수 있음
        for (String key : hashMap.keySet())
            for (int j = 1; j <= key.length() - 1; j++)
                if (hashMap.containsKey(key.substring(0, j)))
                    return false;
        return true;
    }

    public static void main(String[] args) {
        String[] phone_book = {"12","123","1235","567","88"};
        boolean answer = false;

        System.out.println(solution(phone_book));

        char a = 'a';
        char b = 'a';
        if(a==b)
            System.out.println("true");

    }

        /*
        boolean answer = true;

        for(int i=0; i< phone_book.length-1; i++){
            // hashPhone에 phone_book[i]의 해쉬코드를 삽입
            int hashPhone = phone_book[i].hashCode();
            // len에 phone_book[i]의 길이를 삽입
            int len = phone_book[i].length();

//            System.out.println(phone_book[0].substring(0, phone_book[1].length()));

            // i 번째의 다음 배열 j를 가지고 비교
            for(int j=i+1; j<phone_book.length; j++){
                // 다음 배열 값과 길이가 같고 헤쉬값이 같은 경우 (동일한경우)
                if(phone_book[j].length() >= len
                        && hashPhone == (phone_book[j].substring(0, len).hashCode())){
                    answer = false;
                    break;
                }else if(phone_book[j].length() < len
                        && phone_book[i].substring(0, phone_book[j].length())
                                        .hashCode() == phone_book[j].hashCode()){
                    answer = false;
                    break;
                }
            }
        }
         */


}
