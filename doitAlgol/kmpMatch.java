package doitAlgol;

public class kmpMatch {
    public static void main(String[] args) {

    }

    static int kmpMatch(String txt, String pat){
        int pt = 1; // txt cursor
        int pp = 0; // pat cursor
        int[] skip = new int[pat.length() + 1]; // skip table

        // make skip table
        skip[pt] = 0;
        while(pt != pat.length()){
            if(pat.charAt(pt) == pat.charAt(pp))
                skip[++pt] = ++pp;
            else if(pp == 0) // 한번도 일치하지 않았을 때
                skip[++pt] = pp;
            else
                pp = skip[pp];
        }

        // search
        pt = pp = 0;
        while(pt != txt.length() && pp != pat.length()){
            if(txt.charAt(pt) == pat.charAt(pp)){
                pt++;
                pp++;
            }else if(pp == 0) // 한번도 일치하지 않았을 때
                pt++;
            else
                pp = skip[pp];
        }

        if(pp == pat.length())
            return pt - pp;
        return -1;
    }
}
