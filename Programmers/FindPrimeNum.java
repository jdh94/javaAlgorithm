package Programmers;
import java.util.HashSet;

public class FindPrimeNum {
    // 중복방지를 위한 해쉬 함수 선언
    static HashSet<Integer> set = new HashSet<>();
    // 각 단어 저장을 위한 문자열 배열
    static char[] arr;
    // 방문여부를 확인하기 위한 boolean 배열
    static boolean[] visited;

    public static void main(String[] args) {
        String numbers = "123";

        System.out.println(solution(numbers));
    }

    public static int solution(String numbers) {
        int answer = 0;
        arr= new char[numbers.length()];
        visited= new boolean[numbers.length()];

        for(int i=0; i<numbers.length(); i++){
            arr[i]=numbers.charAt(i);
        }

        // 재귀호출
        recursion("", 0);

        answer= set.size();
        return answer;
    }

    // 재귀: 가능한 숫자 조합을 찾고 소수여부에 따라 set에 추가
    public static void recursion(String str, int idx){
        int num;
        if(str != "") {
            num= Integer.parseInt(str);
            if(isPrime(num)){
                set.add(num);
                System.out.println(num);
            }
        }

        if(idx == arr.length) return;

        for(int i=0; i<arr.length; i++){
            // 방문했을 경우 통과
            if(visited[i]) continue;
            visited[i] = true;
            // arr[0].. [n]까지 반복,
            recursion(str+arr[i], idx+1);
            visited[i] = false;
        }
    }//rec

    public static boolean isPrime(int num){ //소수 판별
        if(num==1||num==0) return false;
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0) return false;
        }

        return true;
    }
}