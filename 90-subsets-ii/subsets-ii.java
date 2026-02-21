class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();

        Arrays.sort(nums);
        combination(nums , 0 , ans , comb);

        return ans;
    }

    public static void combination(int arr[] , int i,List<List<Integer>> ans ,List<Integer> comb){

        ans.add(new ArrayList<>(comb));

        for (int start = i ; start < arr.length; start++){

            // ⭐ duplicate skip
            if(start > i && arr[start] == arr[start-1]) continue;

            comb.add(arr[start]);
            combination(arr , start + 1 , ans , comb);
            comb.remove(comb.size() - 1);
        }
    }
}
