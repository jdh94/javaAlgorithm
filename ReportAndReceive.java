import java.util.*;
class ReportAndReceive {
    public int[] solution(String[] id_list, String[] report, int k) {

        Map<String,List<String>> map= new HashMap<>();
        Map<String,Integer> mail_map = new HashMap<>();
        // 모든 유저에 대해 신고자리스트를 생성
        // Key: 유저, Value: 유저를 신고한 사람들
        for(String user: id_list){
            List<String> list = new LinkedList<>();
            map.put(user,list);
            mail_map.put(user,0);
        }
        // 신고자: attacker 신고당한자 : defender
        // 신고당한 건수를 처리함       
        for(String temp: report){
            String[] arr=temp.split(" ");
            String attacker=arr[0];
            String defender=arr[1];
            List<String> list =map.get(defender);
            //중복신고를 막음
            if(list.contains(attacker)){
                continue;
            }
            list.add(attacker);
            map.put(defender,list);
        }
        // K번 신고당한 사람을 찾고, 신고한 사람들에게 Count증가
        for(String data: map.keySet()){
            List<String> list =map.get(data);
            if(list.size()>=k){
                for(String user: list){
                    int count =mail_map.get(user)+1;
                    mail_map.put(user,count);
                }
            }
        }
        int i=0;
        int[] answer = new int[id_list.length];
        for(String data: id_list){
            answer[i]= mail_map.get(data);
            i++;
        }
        return answer;
    }
}
