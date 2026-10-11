class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for(int i = 1 ; i <= n ; i++){
            if(isSpecial(i , n)){
                sum += nums[i-1] * nums[i-1];
            }
        }

        return sum;
    }

    public boolean isSpecial(int num , int n){
        return n % num == 0;
    }
}