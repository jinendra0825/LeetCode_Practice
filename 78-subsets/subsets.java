class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();

        combination(nums , 0 , ans , comb);

        return ans;
    }

    public static void combination(int arr[] , int i, List<List <Integer>> ans , List<Integer> comb){
         
        //  Base Case

        if(i == arr.length){
            if(ans.contains(comb)){
                return;
            }else{
                ans.add(new ArrayList(comb));
            }

        }


        // Take Condition

        if(i < arr.length){

        comb.add(arr[i]);
        combination(arr , i + 1 , ans , comb);
        comb.remove(comb.size() - 1);
        combination(arr , i + 1 , ans , comb);
        }


        // NotTake
        



    }
}