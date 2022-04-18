package etc;
import java.util.*;

class PrimeSel {
    public int solution(int[] nums) {
        int answer = 0;

        // 3가지 숫자를 선택하여 더한 값을 리스트에 넣어준다.
        // 리스트에 들어있는 값들 중 소수의 갯수를 계산해준다.

        List<Integer> sumList = new ArrayList<Integer>();

        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    sumList.add(sum);
                }
            }
        }

        for(int sum : sumList){
            System.out.print(sum + " ");
            int count = 0;
            for(int i=2; i<=sum/2; i++){
                if(sum%i == 0){
                    count++;
                }
            }

            if(count == 0){
                answer++;
            }
        }

        return answer;
    }
}
