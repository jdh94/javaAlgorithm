package Programmers;


public class JOYSTICK {
    public static void main(String[]args){
        String name = "JEN";

        System.out.print(solution(name));
    }

    public static int solution(String name){
        int answer = 0;

        char[] temp = name.toCharArray();
        int[] tempInt = new int[temp.length];

        for(int i=0; i<temp.length; i++){
            tempInt[i] = (int)temp[i];

            int a = (int)'A';
            int z = (int)'Z';
            int n = (int)'N';

            if(tempInt[i] > n){
                answer = answer + (tempInt[i] - n);
            }else{
                answer = answer + (n - tempInt[i]);
            }

//            System.out.println(a);
//            System.out.println(z);
        }

        return answer;
    }
}
