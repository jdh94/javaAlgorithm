package etc;

public class FailRateR {
        public String[] solution(int n, int[] arr1, int[] arr2) {
            String[] answer = {};

            //1. 정수를 이진수로 변환한다.
            //2. 이진수로 변환한 수를 이차원 배열에 입력한다.
            //3. 이차원 배열의 arr1, arr2를 겹쳐준다
            //4. 더해서 0을 제외한 값을 모두 #으로 입력한다.
            int[][] bin = new int[n][n];
            for(int i=0; i<n; i++){
                bin[i] = toBinArr(n, arr1[i]);
            }

            System.out.println(bin);

            return answer;
        }

        public static int[] toBinArr(int size, int decimal){
            int [] arr = new int[size];

            int [] backBin = new int[size];
            for(int i=0; i<size; i++){
                // 9 = 1   0   0  1  0
                arr[size-i] = decimal % 2;
                if(decimal != 0){
                    decimal = decimal / 2;
                }
            }

            return arr;
        }
}
