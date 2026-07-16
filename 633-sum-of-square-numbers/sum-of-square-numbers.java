class Solution {
    public boolean judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++) {
            long target = c - a * a;

            if (binarySearch(target)) {
                return true;
            }
        }

        return false;
    }

    private boolean binarySearch(long target) {
        long left = 0;
        long right = (long) Math.sqrt(target);

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == target) {
                return true;
            } else if (square < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}