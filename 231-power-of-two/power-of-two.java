class Solution {
    public boolean isPowerOfTwo(int n) {
        int cnt = 0;
        if(n < 0) return false;
        for(int i = 0 ; i < 32 ; i++){
            if((n  & 1) == 1){
                cnt++;
            }
            n = (n >> 1) ;
        }
        
        return (cnt == 1);
    }
}