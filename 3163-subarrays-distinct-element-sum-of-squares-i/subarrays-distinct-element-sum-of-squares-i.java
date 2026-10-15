class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            int[] freq = new int[101];
            int distinct = 0;

            for (int j = i; j < n; j++) {
                int val = nums.get(j);

                if (freq[val] == 0) {
                    distinct++;
                }

                freq[val]++;
                totalSum += distinct * distinct;
            }
        }

        return totalSum;
    }
}