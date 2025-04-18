class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double all = 0;
        int count = 0;
        
        for(int i : arr){
            all+=i;
            count++;
        }
        
        answer = (all / count);
        
        return answer;
    }
}