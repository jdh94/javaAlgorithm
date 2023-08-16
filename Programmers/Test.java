package Programmers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution test = new Solution();
//        t	p	result
//        "3141592"	"271"	2
        System.out.println(test.solution("10203", "15"));
        System.out.println(test.solution("10203", "15"));
    }

    static class Solution {
        public int solution(String t, String p) {
            // 1. 문자열 후보리스트를 만든다.
            // 2. 문자열 후보리스트와 비교할 문자를 비교한다.
            int answer = 0;
            ArrayList<Long> list = new ArrayList<Long>();

            int pLen = p.length();
            for(int i=0; i<t.length()-pLen+1; i++){
                StringBuffer sb = new StringBuffer();
                sb.append(t.substring(i,i+pLen));
                list.add(Long.parseLong(sb.toString()));
            }

            long toLong = Long.parseLong(p);
            for(Long i : list){
                if(toLong >= i)
                    answer++;
            }
            return answer;
        }
    }
}
