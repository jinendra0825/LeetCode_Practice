class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        List<Integer> ans = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();

        for(int i = 0 ; i < nums1.length; i++){
            set1.add(nums1[i]);
        }

        for(int i = 0 ; i < nums2.length; i++){
            set2.add(nums2[i]);
        }

        for(int i = 0 ; i < nums3.length; i++){
            set3.add(nums3[i]);
        }

        for(int i = 0 ; i <= 100; i++){
            if(set1.contains(i) && set2.contains(i) ||
               set2.contains(i) && set3.contains(i) ||
               set3.contains(i) && set1.contains(i)){
                ans.add(i);
               }
        }

        return ans;
    }
}