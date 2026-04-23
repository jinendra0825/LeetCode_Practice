import java.util.*;

class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] ans = new long[n];

        // group indices
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }

        // list mai daal raha hu. and left contribution calculate karunga
        for(List<Integer> list : map.values()){
            int size = list.size();
            
        long prefixSum = 0;

            // left contribution
            for(int i = 0; i < size; i++){
                 int idx = list.get(i);
                 ans[idx] += (long) i * idx - prefixSum;
                prefixSum += idx;
            }

            // bhai right ka calculate karne ke liye 0 bana rahe hai
            prefixSum = 0;

            // right contribution
            for(int i = size - 1; i >= 0; i--){
                int idx = list.get(i);
                ans[idx] += prefixSum - (long)(size - 1 - i) * idx;
                prefixSum += idx;
            }
        }

        return ans;
    }
}