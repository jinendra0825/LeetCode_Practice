class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        int ans =0;
        for(int i = 0; i < nums.length; i++){
            int count =0;
            for(int j = i; j < nums.length; j++){
                count += nums[j];

                if(count == goal){
                    ans++;
                }
            }
        }

        return ans;
    }
}