class Solution {
    public int maxArea(int[] height) {
        //My logic is going to store largest element and second largest element.

        int left = 0;
        int right = height.length - 1;

        int ans = 0;

        // lower bar se i tak ka distacnce --> lower * (distance between pointer)

        while (left < right) {

            int area = Math.min(height[left], height[right]) * (right - left);

            ans = Math.max(ans, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return ans;

    }
}