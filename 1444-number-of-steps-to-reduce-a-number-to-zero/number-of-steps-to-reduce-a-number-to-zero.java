class Solution {
    public int numberOfSteps(int n) {
        int cnt =0 ;

        while(n > 0){
            cnt++;
            if(n % 2 == 0){
                n = n / 2;
            }else {
                n = n - 1;
            }
        }

        return cnt;

    }
}