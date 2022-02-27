package com.company;

class FindMaxRectang {
    public int solution(int[][] sizes) {
        // 가장큰 가로크기, 가장큰 세로크기 
        int answer = 0;

        // 가로를 크게 하도록 세팅
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }

        // 가장큰 카로크기와 세로크기 구하기
        int length1 = 0;
        int length2 = 0;
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0] > length1)
                length1 = sizes[i][0];
            if(sizes[i][1] > length2)
                length2 = sizes[i][1];
        }

        answer = length1 * length2;

        return answer;
    }
}
