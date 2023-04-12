package Programmers;

import java.util.ArrayList;
import java.util.Stack;

public class NumContry {
    public static void main(String[] args) {
        int n = 15;

        System.out.println(solution(n));
    }

    public static String solution(int n) {
        // 나머지가 0일때 4 1일때 1 2일때 2
        String[] numbers = {"4", "1", "2"};
        String answer = "";

        int num = n;

        while(num > 0){
            int remainder = num % 3;
            num /= 3;

            if(remainder == 0) num--;

            answer = numbers[remainder] + answer;
        }

        return answer;
    }
}
