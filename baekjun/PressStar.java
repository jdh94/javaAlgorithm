package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PressStar {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int starCnt = scanner.nextInt();
        int len = (starCnt-1)*4+1;
        char[][] cStar = new char[len][len];

        printStar(0, cStar, len);

        for(int i=0; i<(starCnt-1)*4+1; i++){
            for(int j=0; j<(starCnt-1)*4+1 ;j++){
                System.out.print(cStar[i][j]);
            }
            System.out.println();
        }
    }

    public static void printStar(int s, char[][] cStar, int len){

        for(int i=s; i<len; i++) {
            cStar[s][i] = '*';
            cStar[len-1][i] = '*';
            cStar[i][s] = '*';
            cStar[i][len-1] = '*';
        }

        if(len == 0)
            return;
            //System.out.println("");
        printStar(s+2, cStar, len-2);
    }


}
