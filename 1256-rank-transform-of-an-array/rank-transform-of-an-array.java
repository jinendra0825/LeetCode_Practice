class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int[] ans = arr.clone();
        Arrays.sort(arr);

        HashMap<Integer, Integer> mpp = new HashMap<>();

        int rank = 1;

        for (int num : arr) {
            if (!mpp.containsKey(num)) {
                mpp.put(num, rank);
                rank++;
            }
        }

        for (int i = 0; i < ans.length; i++) {
            ans[i] = mpp.get(ans[i]);
        }

        return ans;
    }
}