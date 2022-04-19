package baekjun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Dutbojab {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);

        Set<String> nonHeared = new HashSet<>();
        ArrayList<String> tempAnswer = new ArrayList<>();

        for(int i=0; i<n; i++)
            nonHeared.add(br.readLine());
        for(int i=0; i<m; i++) {
            String temp = br.readLine();
            if(nonHeared.contains(temp))
                tempAnswer.add(temp);
        }

        Collections.sort(tempAnswer);

        String[] answer = tempAnswer.toArray(new String[tempAnswer.size()]);

        System.out.println(answer.length);
        for(int i=0; i<answer.length; i++)
            System.out.println(answer[i]);
    }
}
