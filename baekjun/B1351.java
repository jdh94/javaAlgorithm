package baekjun;

import java.util.Scanner;

public class B1351 {
    public static void main(String[] args) {
        // 입력 N, P, Q
        // 출력 N번째 정수
        // A[0] = 1
        // A[i] = A[i/P] + A[i/Q]

        // A[1] = A[1/2] A[1/3] = A[0] + A[0] = A[0] + A[0]
        // A[2] = A[2/2] + A[2/3] = A[1] + A[0] = A[0] + A[0] +A[0]
        // A[3] = A[3/2] + A[3/3] = A[1] + A[1] = A[0] + A[0] + A[0] + A[0]
        // A[4] = A[4/2] + A[4/3] = A[2] + A[1]
        // A[5] = A[5/2] + A[5/3] = A[2] + A[1]
        // A[6] = A[6/2] + A[6/3] = A[3] + A[2]
        // A[7] = A[7/2] + A[7/3] = A[3] + A[2]

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int P = scanner.nextInt();
        int Q = scanner.nextInt();

        int[] A = new int[N+1];
        A[0] = 1;

        for(int i=1; i<=N; i++){
            A[i] = A[i/P] + A[i/Q];
        }

        System.out.println(A[N]);
    }
}
