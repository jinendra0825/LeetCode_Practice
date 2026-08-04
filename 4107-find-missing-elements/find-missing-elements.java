class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        // Set<Integer> set = new HashSet<>();

        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;

        // for(int i = 0 ; i < nums.length; i++){
        //     max = Math.max(max, nums[i]);
        //     min = Math.min(min , nums[i]);
        //     set.add(nums[i]);
        // }

       
        Arrays.sort(nums);

        int min = nums[0];
        int max = nums[nums.length -1];

        int j = 0;

        for(int i = min; i < max; i++){
            if(i != nums[j]){
                ans.add(i);
            }else{
                j++;
            }
        }

        return ans;

    }
}