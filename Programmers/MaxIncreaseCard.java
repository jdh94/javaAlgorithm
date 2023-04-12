package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxIncreaseCard {
    public static void main(String[] args) {
        int p[] = {103,101,103,103,101,102,100,100,101,104};
        List<Integer> lp = new ArrayList<>();
        for(int i=0; i<p.length-1; i++){
            lp.add(p[i]);
        }

        System.out.println(makeIncreasingSequence(p));

        Arrays.sort(p);

        int count = 0;
        for(int i=0; i<p.length-1; i++){
            System.out.print(p[i] + ", ");
            if(p[i] == p[i+1]) {
                int temp = p[i+1];
                for(int j=i+1; j< p.length-2; j++){
                    if(temp < p[j+1]) {
                        p[i+1] = p[j+1];
                        p[j+1] = temp;
                        break;
                    }
                }
            }
        }

        for(int i=0; i<p.length-1; i++) {
            if (p[i] < p[i+1]) {
                count++;
            }
        }

        // 10 10 20 2

        System.out.println(count);
    }

    public static int findMaxIncreasingInterval(int[] P) {
        Arrays.sort(P); // 리스트를 정렬합니다.
        int maxInterval = 1;
        int currentInterval = 1;
        for (int i = 1; i < P.length; i++) {
            if (P[i] > P[i-1]) { // 현재 원소가 이전 원소보다 큰 경우
                currentInterval++; // 증가 구간을 1 증가시킵니다.
                if (currentInterval > maxInterval) { // 최댓값을 갱신합니다.
                    maxInterval = currentInterval;
                }
            } else { // 현재 원소가 이전 원소보다 작거나 같은 경우
                currentInterval = 1; // 증가 구간을 초기화합니다.
            }
        }
        return maxInterval;
    }

    public static int longestIncreasingSubsequence(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] > max) {
                max = dp[i];
            }
        }

        return max;
    }

    public static int maxIncreasingSubsequence(int[] arr) {
        return longestIncreasingSubsequence(arr);
    }

    public static int getMaxIncreasingRange(List<Integer> P) {
        int n = P.size();
        int[] dp = new int[n];
        dp[0] = 1;
        int maxCount = 1;

        for (int i = 1; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (P.get(i) > P.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxCount = Math.max(maxCount, dp[i]);
        }

        return maxCount;
    }

    public static int findMaxIncreasingIntervals(int[] cards) {
        int n = cards.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1); // 초기값은 모두 1로 설정

        // dp 배열 계산
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (cards[j] < cards[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        // dp 배열에서 가장 큰 값 찾기
        int maxInterval = 0;
        for (int i = 0; i < n; i++) {
            maxInterval = Math.max(maxInterval, dp[i]);
        }

        return maxInterval;
    }

    public static int[] makeIncreasingSequence(int[] cards) {
        int n = cards.length;
        int[] dp = new int[n];
        int[] prev = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 0; i < n; i++) {
            prev[i] = -1;
            for (int j = 0; j < i; j++) {
                if (cards[j] < cards[i] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }
        }

        int maxIdx = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] > dp[maxIdx]) {
                maxIdx = i;
            }
        }

        int[] result = new int[dp[maxIdx]];
        int idx = result.length - 1;
        while (maxIdx >= 0) {
            result[idx] = cards[maxIdx];
            idx--;
            maxIdx = prev[maxIdx];
        }

        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + ", ");
        }


        return result;
    }
}


