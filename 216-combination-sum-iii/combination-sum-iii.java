class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        combination(arr, 0, k, n, ans, comb);

        return ans;
    }

    public static void combination(int arr[], int ind, int k, int sum, List<List<Integer>> ans, List<Integer> comb) {

        // Base Case

        if (comb.size() == k) {
            if (sum == 0) {
                ans.add(new ArrayList<>(comb));
                return;
            }

            return;
        }

        if (ind >= arr.length || sum < 0)
            return;

        // Take 

        comb.add(arr[ind]);

        combination(arr, ind + 1, k, sum - arr[ind], ans, comb);

        comb.remove(comb.size() - 1);

        combination(arr, ind + 1, k, sum, ans, comb);

    }
}