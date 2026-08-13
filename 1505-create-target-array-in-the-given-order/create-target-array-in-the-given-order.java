class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < index.length; i++){
            int ind = index[i];
            int num = nums[i];

            ans.add(ind , num);
        }

        int [] fans = new int[ans.size()];

        for(int i = 0 ; i < ans.size(); i++){
            fans[i] = ans.get(i);
        }

        return fans;
    }
}