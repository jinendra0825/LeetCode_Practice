class Solution {
    public int sumCounts(List<Integer> nums) {

        int totalSum = 0;
        
        for(int i = 0 ; i < nums.size(); i++){
            // int distinct = 0;
            HashSet<Integer> set = new HashSet<>();

            for(int j  = i ; j < nums.size(); j++){
                set.add(nums.get(j));
                int distinct = set.size();
                totalSum += distinct * distinct;

            }

            
        }

        return totalSum;
    }
}