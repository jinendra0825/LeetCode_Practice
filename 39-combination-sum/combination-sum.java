class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        combination(candidates , 0 , 0 , target, new ArrayList<>() ,  ans);
        return ans;


    }

    public void combination(int arr[], int i, int sum , int target, List<Integer> comb, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(comb));
            return;
        }
        
        if(i == arr.length || target < 0) return;
        

    //    Take

        comb.add(arr[i]);

        combination(arr, i , sum , target - arr[i], comb, ans);

        // Backtrack - skip the elemets

        comb.remove(comb.size()-1);

        // recall for non skipped elements;

        combination(arr, i + 1, sum , target, comb, ans);
        

    }


}