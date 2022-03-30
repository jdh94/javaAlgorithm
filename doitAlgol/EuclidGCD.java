package doitAlgol;

import java.util.Scanner;

public class EuclidGCD {
    static int gcd(int x, int y){
        if(y==0)
            return x;
        else
            return gcd(y, x%y);
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int x = stdIn.nextInt();
        int y = stdIn.nextInt();

        System.out.println(gcd(x, y));
    }
}
