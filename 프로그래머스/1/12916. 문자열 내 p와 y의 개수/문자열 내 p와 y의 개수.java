class Solution {
    boolean solution(String s) {
        boolean answer = true;

        char[] arr = s.toCharArray();
        
        int pLength = 0;
        int yLength = 0;
        for (char i : arr) {
            char lower = Character.toLowerCase(i);  // 대문자 -> 소문자로 변환
            if (lower == 'p') {
                pLength++;
            }
            if (lower == 'y') {
                yLength++;
            }
        }
        
        if(pLength == yLength){
            answer = true;
        }
        else{
            answer = false;   
        }

        return answer;
    }
}