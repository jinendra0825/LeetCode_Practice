import java.util.*;

class Solution {

    public List<List<Integer>> combinationSum2(int[] arr, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);   // ⭐ important

        backtrack(arr, 0, target, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(int[] arr, int start, int target,
                           List<Integer> comb,
                           List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(comb));
            return;
        }

        for (int i = start; i < arr.length; i++) {

            // ⭐ duplicate skip
            if (i > start && arr[i] == arr[i - 1]) continue;

            if (arr[i] > target) break;

            comb.add(arr[i]);
            backtrack(arr, i + 1, target - arr[i], comb, ans);
            comb.remove(comb.size() - 1);
        }
    }
}
