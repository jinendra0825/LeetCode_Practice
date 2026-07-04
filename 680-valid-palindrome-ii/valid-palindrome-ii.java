class Solution {
    public boolean validPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        // Try deleting the left character
        boolean flag = false;
        boolean ans1 = true;

        while (i < j) {

            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {

                if (flag) {
                    ans1 = false;
                    break;
                }

                flag = true;
                i++;
            }
        }

        // Try deleting the right character
        i = 0;
        j = s.length() - 1;

        flag = false;
        boolean ans2 = true;

        while (i < j) {

            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {

                if (flag) {
                    ans2 = false;
                    break;
                }

                flag = true;
                j--;
            }
        }

        return ans1 || ans2;
    }
}