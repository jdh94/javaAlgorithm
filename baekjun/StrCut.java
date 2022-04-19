package baekjun;

import java.util.Scanner;



public class StrCut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
        int c = scanner.nextInt();

        String[] str = new String[r];
        String[] strArr = new String[c];
        for(int i=0; i<r; i++) {
            str[i] = scanner.nextLine();
            if(!(str[i].length() == c)) {
                str[i] = null;
                i--;
            }else{
                for(int j=0; j<c; j++)
                    strArr[j] = strArr[j] + str[i].charAt(j);
            }
        }
    }

}
