package baekjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class B2866hashset {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        char[][] word = new char[R][C];

        for(int r=0; r<R; r++){
            word[r] = br.readLine().toCharArray();
        }

        Set<String> set;
        StringBuilder sb;
        int cnt = 0;
        String[] arr = new String[C];

        // 입력으로 생성되는 행 문자열 arr에 입력
        for(int c=0; c<C; c++){
            sb = new StringBuilder();
            for(int r=0; r<R; r++){
                sb.append(word[r][c]);
            }
            arr[c] = sb+"";
        }

        for(int r=0; r<R; r++){
            set = new HashSet<>();
            for(int c=0; c<C; c++){
                String now  = arr[c].substring(r);
                if(set.contains(now)) break stop;
                else set.add(now);
            }
            System.out.println(cnt);
        }
    }

}
