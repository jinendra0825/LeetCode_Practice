class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        int n = image.length;
        int[][] ans = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                int val = image[i][n - 1 - j]; // flip

                if (val == 1) {
                    ans[i][j] = 0;
                } else {
                    ans[i][j] = 1;
                }
            }
        }

        return ans;
    }
}