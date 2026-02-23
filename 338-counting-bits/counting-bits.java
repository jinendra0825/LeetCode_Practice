class Solution {
    public int[] countBits(int n) {
        int [] ans = new int [n + 1];

        for(int i = 0 ; i <= n; i++){
            ans[i]  = countIndividual(i);
        }

        return ans;


    }
    public static int countIndividual(int n){
        int cnt = 0 ;

        for(int i = 0 ; i < 32; i++){
            if((n & 1) == 1){
                cnt++;
            }
            n = ( n >> 1);
        }
        return cnt;
    }
}