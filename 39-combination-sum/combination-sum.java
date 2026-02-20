class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();

        combinations(arr, 0 , target , ans , comb);    

        return ans;
    }

    public static void combinations(int arr[] , int i, int target, List<List<Integer>> ans, List<Integer> comb ){
        // Base condition
        if(i == arr.length){
            if(target == 0){
               ans.add(new ArrayList<>(comb));
            }
            return;
        }

       if(arr[i] <= target){
        comb.add(arr[i]);

        combinations(arr , i , target - arr[i] , ans, comb);

        comb.remove(comb.size() - 1);
       }

       combinations(arr, i + 1, target, ans, comb);
    }
}