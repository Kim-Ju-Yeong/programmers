class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        for(long i=a;i<=b;i++){
            answer += i;
        }
        
        if(answer == 0){
            for(long i=b;i<=a;i++){
                answer += i;
            }
        }
        
        return answer;
    }
}