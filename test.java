class Solution {
    public String solution(String new_id) {
        String answer = "";

        //1 단계
        new_id = new_id.toLowerCase();
        System.out.println("1 단계" + new_id);

        //2 단계
        new_id = new_id.replaceAll("[^0-9a-z-_.]", "");
        System.out.println("2 단계" + new_id);

        //3단계
        new_id = new_id.replaceAll("[.]{2,}",".");
        System.out.println("3 단계" + new_id);

        //4단계
        new_id = new_id.replaceAll("^[.]|[.]$", "");
        System.out.println("4 단계" + new_id);

        //5단계
        if(new_id.equals("")){
            new_id = "a";
        }
        System.out.println("5 단계" + new_id);

        //6단계
        if(new_id.length() >= 16){
            new_id = new_id.substring(0, 15);
            new_id = new_id.replaceAll("[.]$", "");
        }
        System.out.println("6 단계" + new_id);

        //7단계
        if (new_id.length() <= 2 ) {
            while(new_id.length() <= 2) {
                new_id += new_id.charAt(new_id.length()-1);
            }
        }
        System.out.println("7 단계" + new_id);

        answer = new_id;

        return answer;
    }
}