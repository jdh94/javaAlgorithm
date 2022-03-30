import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // 숫자를 입력받고 변환 횟수와 3의 배수인지 아닌지를 출력한다.
        // 1. 각 숫자를 쪼개서 더해준다.
        // 2. 쪼갠 숫자가 두자리 수 이상이면 반복해주고, 한자리 수이면 3으로 나누어 결과를 리턴한다.

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        int count = 0;

        threeMul(num, count);
    }

    public static void threeMul(int num, int count) {
        String sNum = Integer.toString(num);
        char[] cNum = sNum.toCharArray();
        int[] arrNum = new int[cNum.length];

        int sum = 0;
        for(int i=0; i<cNum.length; i++){
            arrNum[i] = Character.getNumericValue(cNum[i]);
            sum += arrNum[i];
        }

        if(cNum.length > 1){
            count++;
            threeMul(sum, count);
        }else{
            System.out.println(count);
            if(sum % 3 == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
