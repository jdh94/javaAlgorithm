package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B2866 {
    static int R, C;
    static char[][] table;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 구분자 기준으로 쪼개는 클래스 StringTokenizer
        StringTokenizer st = new StringTokenizer((br.readLine()));
        C = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        table = new char[R][C];

        for(int i=0; i<C; i++){
            String input = br.readLine();
            for(int j=0; j<R; j++){
                table[j][i] = input.charAt(j);
            }
        }

        System.out.println(binarySearch());
        br.close();
    }

    public static int binarySearch(){
        int ans = 0, left = 1, right = C-1;
        while(left <= right){
            int mid = (left + right) >> 1;
            if(check(mid)){
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static boolean check(int start){
        String[] arr = new String[R];

        for(int i=0; i<R; i++){
            // copyOfRange(복사할 배열, 시작할 인덱스, 끝날 인덱스)
            arr[i] = String.valueOf(Arrays.copyOfRange(table[i], start, C));
        }
        Arrays.sort(arr);

        for(int i=0; i<R-1; i++){
            if(arr[i].equals(arr[i+1])) return false;
        }

        return true;
    }
}







