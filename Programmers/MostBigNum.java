package Programmers;

import java.util.Arrays;
import java.util.Comparator;

public class MostBigNum {
    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};

        System.out.println(solutuon(numbers));
    }

    public static String solutuon(int[] numbers){
        String answer = "";
        String[] str = new String[numbers.length];

        for(int i=0; i<numbers.length; i++){
            str[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b+a).compareTo(a+b);
            }
        });

        if(str[0].equals("0"))
            return "0";

        StringBuilder sb = new StringBuilder();
        for(String s: str){
            sb.append(s);
        }
        answer = sb.toString();

        return answer;
    }
}
