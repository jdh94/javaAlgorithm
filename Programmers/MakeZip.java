package Programmers;

public class MakeZip {
    public int solution(String s) {
        // 1. 문자열 배열을 몇개 단위로 자를 수 있는지 확인한다.
        // 2. 문자열 배열을 단위로 자르고 단위로 자른 문자열의 길이를 구한다.
        // 3. 문자열 길이가 가장 작은 단위의 길이를 리턴한다.

        // 압축하기 전 문자열 길이로 초기화
        int answer = s.length();

        for(int i=1; i<= s.length()/2; i++){
            int zipLevel = 1; // 현재 압축레벨
            String zipStr = s.substring(0, i); // 압축할 문자
            System.out.println("압축할 문자:" + zipStr);

            StringBuilder result = new StringBuilder(); // 압축완료한 문자를 저장할 StringBuilder

            for(int j=i; j<=s.length(); j+= i){
                // 다음 문자 추출
                String next = s.substring(j, j+i > s.length() ? s.length() : i+j);
                System.out.println("j : " + j + " next : " + next);

                if(zipStr.equals(next)) // 다음 문자와 현재 문자가 같으면 zipLevel 증가
                    zipLevel++;
                else{ // 다음 문자와 현재 문자가 다를 경우
                    result.append((zipLevel != 1 ? zipLevel : "") + zipStr);
                    zipStr = next;
                    zipLevel = 1;
                }
            }
            result.append(zipStr);
            answer = Math.min(answer, result.length());
        }

        return answer;
    }
}
