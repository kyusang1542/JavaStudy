package com.study;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

// 완전탐색 소수찾기 해결 못함
public class test2 {
    private TreeSet<String> set = new TreeSet<>();
    private int count;

    public static void main(String[] args) {
        String numbers = "17";
        test2 s = new test2();
        System.out.println(s.solution(numbers));
    }

    public int solution(String numbers){

        ArrayList<Character> num = new ArrayList<>();

        for(int i = 0; i<numbers.length(); i++){
            // Integer.valueOf를 사용할 경우 아스키코드 값이 출력되므로
            // Character.getNumbericValue 사용
            num.add(numbers.charAt(i));
            System.out.println(num.get(i));
        }

        ArrayList<Character> result = new ArrayList<>();

        for (int i = 0; i <numbers.length(); i++) {
            permutation(num, result, numbers.length(), i+1);
        }

        return count;
    }

    public boolean isPrime(int n){
        int i;
        int sqrt = (int) Math.sqrt(n);

        // 2는 유일한 짝수 소수
        if(n==2)
            return true;

        // 짝수와 1은 소수가 아님
        if(n%2 == 0 || n==1)
            return false;

        // 제곱근까지만 홀수로 나눠보면 됨
        for (i=3; i<=sqrt; i+=2){
            if(n%i==0)
                return false;
        }
        return true;
    }


    public void permutation(List<Character> arr, List<Character> result, int n, int r){

        if(r == 0){
            // 0으로 시작하는 부분집합은 제외
            if (result.get(0) != '0'){
                String str = "";
                int size = result.size();
                for(int i=0; i<size; i++){
                    str += result.get(i);
                }
                int num = 0;

                // 이미 나온 숫자 조합이 아닐 경우
                if(!set.contains(str)){
                    num = Integer.parseInt(str);
                    set.add(str);

                    // 소수 판별
                    if(isPrime(num)){
                        System.out.println(num);
                        count++;
                    }
                }
            }
            return;
        }
        for(int i=0; i<n; i++){
            result.add(arr.remove(i));
            permutation(arr, result, n-1, r-1);
            arr.add(i, result.remove(result.size()-1));
        }
    }
}
