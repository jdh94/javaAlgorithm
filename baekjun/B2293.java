package baekjun;

import java.util.Scanner;

public class B2293 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int coinType = scanner.nextInt();
        int expectSum = scanner.nextInt();

        int[] coins = new int[coinType];
        for(int i=0; i<coins.length; i++){
            coins[i] = scanner.nextInt();
        }


        for(int i=0; i<coins.length; i++){
            int sum = 0;
            for(int j=coins[i]; j<=expectSum; j++){

            }
        }
    }
}

