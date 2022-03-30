package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt();

        NumPra.solution( n, s);
    }
}

class NumPra{
    public static void solution(int n, int s){
        // k번째에 존재할 숫자의 갯수 = 2k-1
        // 2k번째 정순, 2k-1번째 역순
        // k번째 첫 숫자의 위치 = n-k+1 즉, 공백의 갯수= n-k
        int k = 1;

        for(int i=0; i<n; i++) {
            //공백갯수
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }

            if(k%2 == 0) {
                for (int l = 1; l <= 2 * k - 1; l++) {
                    //각 층 숫자출력
                    System.out.print(s);
                    s++;
                    if (s > 9)
                        s = 1;
                }
            }else{
                List<Integer> tempList = new ArrayList<Integer>();
                for (int l = 1; l <= 2 * k - 1; l++) {
                    tempList.add(s);
                    s++;
                    if (s > 9)
                        s = 1;
                }

                for(int l=1; l<= 2*k-1; l++) {
                    //각 층 숫자출력
                    System.out.print(tempList.get(2*k-1-l));
                }
            }

            //다음층
            k++;
            System.out.println("");
        }
    }
}


class Solution {
    public static int solution(String dartResult) {
        // 1. 문자열을 받아와 숫자, 문자열, 특수문자로 구분해준다.
        // 2. 숫자를 읽으면 그 뒤 문자열을 읽어준다. 문자열을 읽은 뒤 특수문자를 읽어준다.
        // 3. 이전 점수는 항상 기억하고 있는다.
        int answer = 0;

        char[] darts = dartResult.toCharArray();
        int[] score = new int[3];
        int cnt = -1;

        for(int i=0; i<darts.length; i++){
            if(darts[i] >= '0' && darts[i] <= '9'){
                cnt++;
                if(darts[i] == '1' && darts[i+1] == '0'){
                    score[cnt] = 10;
                    i++;
                }else{
                    score[cnt] = Integer.parseInt(String.valueOf(darts[i]));
                }
            }else if(darts[i] == 'D'){
                score[cnt] *= score[cnt];
            }else if(darts[i] == 'T'){
                score[cnt] *= score[cnt] * score[cnt];
            }else if(darts[i] == '*'){
                if(cnt > 0)
                    score[cnt-1] *= 2;
                score[cnt] *= 2;
            }else if(darts[i] == '#'){
                score[cnt] *= -1;
            }
        }

        return answer;
    }
}
