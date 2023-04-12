package Programmers;

public class ChangeWord {
    static boolean[] visited;
    static int answer = 0;

    public static void main(String[] args) {
        String begin = "hit";
        String target = "cog";

        String[] words = {"hot","dot","dog","lot","log","cog"};

        System.out.println(solution(begin, target, words));
    }

    public static int solution(String begin, String target, String[] words){
        visited = new boolean[words.length];

        dfs(begin, target, words, 0);
        return answer;
    }

    public static void dfs(String begin, String target, String[] words, int cnt){
            // 답을 찾았을 때 종료 조건

            if(begin.equals(target)){
                answer = cnt;
                return;
            }

            for(int i=0; i<words.length; i++){
                if(visited[i])
                    continue;

                int k=0;
                for(int j=0; j<begin.length(); j++){
                    if(begin.charAt(j) == words[i].charAt(j)){
                // 문자수가 2개 같은지 체크
                k++;
            }
        }

            if(k == begin.length()-1){
                visited[i] = true;
                dfs(words[i], target, words, cnt + 1);
                visited[i] = false;
            }
        }
    }
}