package etc;

import java.util.*;

class DartSol {
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
