class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> ans = new ArrayList<>();
       List<Integer> comb = new ArrayList<>();

       combination(candidates , 0, target, ans , comb );

       return ans;


    }

    public static void combination(int arr[] , int ind, int target, List<List<Integer>> ans, List<Integer> comb){

        // Base condition
        if(ind == arr.length){
            if(target == 0){
                ans.add(new ArrayList(comb));
                return;
            }

            return;

        }

        // Take Condition
        if(arr[ind] <= target){
        comb.add(arr[ind]);
        combination(arr, ind, target - arr[ind] , ans , comb);
       
        comb.remove(comb.size() - 1);
        }

        // NotTake
        combination(arr, ind + 1 , target , ans , comb);


    }


}