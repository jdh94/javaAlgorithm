package Programmers;

import java.util.HashMap;
import java.util.Map;

public class PhoneNumList {
    public static void main(String[] args){
        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(solution(phone_book));
    }

    public static boolean solution(String[] phone_book) {
        Map<String, Integer> map = new HashMap<>();

        // 모든 전화번호를 hashmap에 넣는다
        for(int i=0; i< phone_book.length; i++)
            map.put(phone_book[i], i);

        // 모든 전화번호의 subString이 hashMap에 존재하는지 확인한다.
        for(int i=0; i<phone_book.length; i++)
            for(int j=0; j<phone_book[i].length(); j++) {
                System.out.println(phone_book[i]);
                System.out.println(phone_book[i].substring(0, j));
                if (map.containsKey(phone_book[i].substring(0, j)))
                    return false;
            }

        return true;
    }
}
