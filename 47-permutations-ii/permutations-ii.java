class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];

        combination(nums, used,  new ArrayList<>(), ans);
        return ans;
    }

     public static void combination(int arr[] , boolean used[],  List<Integer> comb, List<List<Integer>> ans){

        // Base Condition --> 

        if(comb.size() == arr.length){

            ans.add(new ArrayList<>(comb));
            return;   
            
        }

        for(int i = 0 ; i < arr.length; i++){

            if(used[i]) continue;

            if(i > 0 && arr[i] == arr[i-1] && !used[i-1]) continue;

            comb.add(arr[i]);
            used[i] = true;
            combination(arr, used,  comb, ans);


            comb.remove(comb.size() - 1);
            used[i] = false ;
        
        }

        return;


    }

}