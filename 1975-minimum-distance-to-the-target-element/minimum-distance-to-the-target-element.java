class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;

        for(int i = 0 ; i < n ; i++){
            if(nums[i] == target){
                int diff = Math.abs(start - i);
                ans = Math.min(ans , diff);
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}