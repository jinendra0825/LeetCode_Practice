class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int prefixSum[] = new int[n];
        int sum = 0;

        // Store the prefix sum in the array. 

        for(int i = n-1 ; i >= 0 ; i-- ){
            sum += nums[i];
            prefixSum[i] = sum;
        }

        int currSum = 0;

        for(int i = 0 ; i < n; i++){
            currSum += nums[i];

            if(currSum == prefixSum[i] ){
                return i;
            }

        }


        return -1;
    }
}