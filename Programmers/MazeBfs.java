package Programmers;
import java.util.*;

public class MazeBfs {
    public static void main(String[] args) {
        System.out.println("test");
    }

    static class Node{
        int x, y, steps;
        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static int[] dx = {0,0,-1,1};
    public static int[] dy = {1,-1,0,0};

    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        bfs(0,0, maps, n,m);

        //bfs를 끝낸 후 해당자리
        if(maps[n-1][m-1] == 1){
            return -1;
        }

        return maps[n-1][m-1];
    }

    public static void bfs(int x, int y, int[][] maps, int n, int m){
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x,y));

        while(!q.isEmpty()){
            Node node = q.poll();
            for(int i=0; i<4; i++){
                int nx = node.x + dx[i];
                int ny = node.y + dx[i];
                // 인덱스가 벗어남을 방지
                if(ny >= m || nx >= n || nx < 0 || ny < 0) continue;
                if(maps[nx][ny] == 0) continue;
                if(maps[nx][ny] == 1){
                    maps[nx][ny] = maps[node.x][node.y] + 1;
                    q.offer(new Node(nx, ny));
                }
            }
        }

    }
}
