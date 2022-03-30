package doitAlgol;

import java.util.Scanner;
import java.util.Stack;

public class Recur {
    static void recur(int n){
        if(n > 0){
            recur(n-1);
            System.out.println(n);
            recur(n-2);
        }
    }

            static void nonRecur(int n ){
                    Stack<Integer> s = new Stack<Integer>();
                    while(true){
                        if(n > 0) {
                            s.push(n);
                            n = n-1;
                            continue;
                        }
                        if(s.isEmpty() != true){
                            n = s.pop();
                            System.out.println(n);
                            n = n-2;
                            continue;
                        }
            break;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input integer : ");
        int x = scanner.nextInt();

        nonRecur(x);
        //recur(x);
    }
}
