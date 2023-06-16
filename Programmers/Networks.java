package Programmers;

public class Networks {
    public static void main(String[] args) {
        // n	computers	return
        // 3	[[1, 1, 0], [1, 1, 0], [0, 0, 1]]	2
        // 3	[[1, 1, 0], [1, 1, 1], [0, 1, 1]]	1

        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};

        System.out.println(solution(3, computers));
    }

    public static int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] network = new boolean[n];

        // 불리언 값은 방문 했는지 체크
        // 노드는 노드의 인덱스
        // 컴퓨터는 인풋값
        for (int node=0; node<n; node++) {
            if (!network[node]) {
                dfs(computers, node, network);
                answer++;
            }
        }

        return answer;
    }

    public static boolean[] dfs(int[][] computers, int node, boolean[] visited) {
        visited[node] = true;

        for (int idx=0; idx<computers.length; idx++) {
            if (node != idx && computers[node][idx] == 1 && visited[idx] == false) {
                visited = dfs(computers, idx, visited);
            }
        }
        return visited;
    }
}
