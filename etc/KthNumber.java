package etc;

import java.util.*;

public class KthNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        // 1. 배열을 잘라서 새로운 배열을 생성한다.
        // 2. 새로 생성된 배열을 정렬한다.
        // 3. 정렬된 배열에서 k번째인 수를 저장해준다.

        for(int i=0; i<commands.length; i++) {
            int srtIdx = commands[i][0]-1;
            int endIdx = commands[i][1];
            int k = commands[i][2]-1;

            int[] sortedArr = Arrays.copyOfRange(array, srtIdx, endIdx);
            Arrays.sort(sortedArr);

            for(int j=0; j<sortedArr.length; j++){
                System.out.println("startIdx:" + srtIdx + " endIdx:"+ endIdx + " " + sortedArr[j]);
            }
            answer[i] = sortedArr[k];
        }

        return answer;
    }
}