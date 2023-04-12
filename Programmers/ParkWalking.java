package Programmers;

public class ParkWalking {
        public int[] solution(String[] park, String[] routes) {
            // 1. 지도를 그린다
            // 1-1 시작지점을 기억한다.
            // 1-2 통행가능한 부분은 1으로 안되는 부분은 0로 표시한다.
            // 2. 경로를 찾는다
            // 2-1 방향으로 나아간다 1이면 나아가고 0을 만나면 그대로 돌아온다.
            // 3. 도착점을 리턴한다

            int[] answer = {0,0};

            int x = park.length;
            int y = park[0].length();
            int[][] map = new int[x+2][y+2];
            createMap(park, map, answer);

            // N E S W
            answer = findLocation(map, routes, answer);

            return answer;
        }

        public static void createMap(String[] park, int[][] map, int[] answer){
            // 1 채우기
            // 0은 막힌곳 1은 뚫린곳 2는 시작점
            for(int i=1; i<map.length-1; i++){
                for(int j=1; j<map[i].length-1; j++){
                    map[i][j] = 1;
                    if(park[i-1].charAt(j-1) == 'X')
                        map[i][j] = 0;
                    else if(park[i-1].charAt(j-1) == 'S'){
                        map[i][j] = 2;
                        answer[0] = i;
                        answer[1] = j;
                    }

                }
            }

            // print
            for(int i=0; i<map.length; i++){
                for(int j=0; j<map[i].length; j++){
                    System.out.print(map[i][j]);
                }
                System.out.print("\n");
            }

        }

        public static int[] findLocation(int[][] map, String[] routes, int[] answer){
            for(int i=0; i<routes.length; i++){
                char direction = routes[i].charAt(0);
                int step = Character.getNumericValue(routes[i].charAt(2));

                int temp = 0;
                for(int j=1; j<=step; j++){
                    if(direction == 'N'){
                        if(map[answer[0]-j][answer[1]] == 0)
                            break;
                    }else if(direction == 'S'){
                        if(map[answer[0]+j][answer[1]] == 0)
                            break;
                    }else if(direction == 'E'){
                        if(map[answer[0]][answer[1]+j] == 0)
                            break;
                    }else if(direction == 'W'){
                        if(map[answer[0]][answer[1]-j] == 0)
                            break;
                    }

                    if(step == j){

                        if(direction == 'N')
                            answer[0] = answer[0] - step;
                        else if(direction == 'S')
                            answer[0] = answer[0] + step;
                        else if(direction == 'E')
                            answer[1] = answer[1] + step;
                        else if(direction == 'W')
                            answer[1] = answer[1] - step;
                    }

                }

            }

            answer[0] = answer[0]-1;
            answer[1] = answer[1]-1;

            return answer;
        }
}
