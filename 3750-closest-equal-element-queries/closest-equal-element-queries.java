// MY SOLUTION --> Correct but not time efficient

// class Solution {
//     public List<Integer> solveQueries(int[] nums, int[] queries) {
//         List<Integer> list = new ArrayList<>();
//         int it = 0;

//         while(it < queries.length){
//             int index = queries[it++];
//             int target = nums[index];
//             int ans = Integer.MAX_VALUE;

//             for(int i = 0 ; i < nums.length ; i++){
//                 if(nums[i] == target && index != i){
//                     int diff = Math.abs(index - i);
//                     int dist = Math.min(diff , nums.length - diff);

//                     ans = Math.min(dist , ans);
//                 }
//             }
//             // 

//             if(ans == Integer.MAX_VALUE){
//                 list.add(-1);
//             }else{
//                 list.add(ans);
//             }
            
//         }

//         return list;
//     }
// }

// GPT ANSWER
class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = nums.length;

        // Step 1: Map value → list of indices
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        List<Integer> result = new ArrayList<>();

        // Step 2: Process each query
        for (int q : queries) {
            int val = nums[q];
            List<Integer> list = map.get(val);

            if (list.size() == 1) {
                result.add(-1);
                continue;
            }

            // Binary search to find closest index
            int pos = Collections.binarySearch(list, q);

            int ans = Integer.MAX_VALUE;

            // Left neighbor
            int left = (pos - 1 + list.size()) % list.size();
            int leftIndex = list.get(left);

            int diffLeft = Math.abs(q - leftIndex);
            ans = Math.min(ans, Math.min(diffLeft, n - diffLeft));

            // Right neighbor
            int right = (pos + 1) % list.size();
            int rightIndex = list.get(right);

            int diffRight = Math.abs(q - rightIndex);
            ans = Math.min(ans, Math.min(diffRight, n - diffRight));

            result.add(ans);
        }

        return result;
    }
}