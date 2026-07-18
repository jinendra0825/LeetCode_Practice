class Solution {
    public int findGCD(int[] nums) {
        int smallest = 10000;
        int largest = 0;

        for(int i = 0; i < nums.length; i++){
            smallest = Math.min(nums[i], smallest);
            largest = Math.max(nums[i], largest);
        }

        for(int i = smallest; i >= 2; i--){
            if(smallest % i == 0 && largest % i == 0){
                return i;
            }
        }

        return 1;
    }
}