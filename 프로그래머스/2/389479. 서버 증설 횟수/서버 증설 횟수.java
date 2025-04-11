import java.util.Scanner;

class Solution {

    public int solution(int[] players, int m, int k) {

        int answer = 0;
        int[] install = new int[24]; 
        int active = 0;              

        for (int i = 0; i < 24; i++) {
            if (i >= k) {
                active -= install[i - k];
            }

            int player = players[i];

            int need = (player / m);

            if (need > active) {
                int add = need - active;
                install[i] = add;
                active += add;
                answer += add;
            }
        }

        return answer;
    }
}
