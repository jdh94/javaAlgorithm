package Programmers;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue2 {
    public static void main(String[] args) {
        System.out.println(solution("()()"));
    }

    public static boolean solution(String s) {
        boolean answer = true;

        Queue<Character> queue = new LinkedList<>();
        for(int i=0; i<s.length(); i++){
            queue.add(s.charAt(i));
        }

        Queue<Character> tmpQueue = new LinkedList<>();
        for(char c : queue){
            if(tmpQueue.isEmpty())
                tmpQueue.add(c);
            else if(tmpQueue.peek() == '(' && c == ')')
                tmpQueue.remove();
            else
                tmpQueue.add(c);
        }

        if(tmpQueue.isEmpty())
            answer = true;
        else
            answer = false;

        return answer;
    }
}
