package codility;

import java.util.HashSet;
import java.util.Set;

public class Distinct {
    public static int main(String[] args) {

        int[] A = new int[6];
        A[0] = 2;
        A[1] = 1;
        A[2] = 1;
        A[3] = 2;
        A[4] = 3;
        A[5] = 1;

        HashSet<Integer> set = new HashSet<Integer>();

        for(int i=0; i<A.length; i++){
            set.add(A[i]);
        }

        int answer = set.size();

        return answer;
    }
}