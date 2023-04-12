package doitAlgol;

public class bmMatch {
    public static void main(String[] args) {

    }

    static int bmMatch(String txt, String pat){
        int pt; // txt cursor
        int pp; // pat cursor
        int txtLen = txt.length();
        int patLen = pat.length();
        int[] skip = new int[Character.MAX_VALUE + 1]; // skip table

        // boyer moore는 패턴을 기준으로 테이블을 만드는 것이 아닌, 문자 테이블을 기준으로 테이블을 만든다.
        // make table
        for(pt=0; pt <= Character.MAX_VALUE; pt++)
            skip[pt] = patLen;
        for(pt=0; pt < patLen - 1; pt++)
            skip[pat.charAt(pt)] = patLen - pt -1; // pt == patten - 1

        // search
        while(pt < txtLen){
            pp = patLen - 1; // pat의 끝 문자에 주목

            while(txt.charAt(pt) == pat.charAt(pp)){
                if(pp == 0)
                    return pt; // 검색 성공
                pp--;
                pt--;
            }
            pt += (skip[txt.charAt(pt)] > patLen - pp) ? skip[txt.charAt(pt)] : patLen - pp;
        }
        return -1; // 검색 실패
    }
}
