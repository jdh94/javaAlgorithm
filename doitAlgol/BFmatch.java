package doitAlgol;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.lang.*;

public class BFmatch {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("text : ");
        String s1 = stdIn.next();

        System.out.println("patten : ");
        String s2 = stdIn.next();

        int idx = bfMatch(s1,s2);

        if(idx == -1)
            System.out.println("search fail");
        else{
            int len = 0;
            for(int i=0; i<idx; i++)
                len += s1.substring(i, i+1).getBytes().length;
            len += s2.length();

            System.out.println((idx + 1) + "번째 문자부터 일치합니다.");
            System.out.println("텍스트" + s1);
            //System.out.println(String.format("패턴 : %%%ds\n", len), s2);
        }
    }

    static int bfMatch(String txt, String pat){
        int pt = 0; // txt cursor
        int pp = 0; // pat cursor

        while(pt != txt.length() && pp != pat.length()){
            if(txt.charAt(pt) == pat.charAt(pp)){
                pt++;
                pp++;
            }else{
                pt = pt - pp + 1;
                pp = 0;
            }
        }
        if(pp == pat.length()) // search success
            return pt - pp;
        return -1; // search fail
    }


}


