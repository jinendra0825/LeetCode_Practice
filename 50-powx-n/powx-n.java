class Solution {
    public double myPow(double x, int n) {
        long N = n;
        double ans = 1;
        if(N  <0 ) N = -1 * N;

        while(N > 0){
            if(N % 2 == 1){
                ans = ans * x;

                N--;
            }else{
                x = x * x;
                N = N/2;
            }
        }

            if(n < 0) ans = (double) 1 /(double) ans;
        
        return ans;


    }
}