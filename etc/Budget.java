package etc;

import java.util.*;

class Budget {
    public int solution(int[] d, int budget) {
        int answer = 0;

        // 1. 부서별 필요예산을 오름차순으로 정렬해준다.
        // 2. 필요예산이 가장 적은 부서부터 가산한다.
        // 3. 가산한 금액과 예산을 비교하여 예산이 금액보다 작아질 때 리턴한다.

//         for(int i=0; i<d.length-1; i++){
//             for(int j=i; j<d.length-1; j++){
//                 if(d[j] > d[j+1]){
//                     int temp = d[j];
//                     d[j] = d[j+1];
//                     d[j+1] = temp;
//                 }
//             }
//         }

        Arrays.sort(d);

        for(int i=0; i<d.length; i++){
            System.out.println(d[i]);
        }

        int sum = 0;
        int count = 0;
        for(int department : d){
            sum += department;
            count++;

            if(sum > budget){
                answer = count - 1;
                return answer;
            }else if(sum == budget){
                answer = count;
                return answer;
            }
        }

        answer = count;

        return answer;
    }
}