class Solution {
    public boolean isPalindrome(String s) {
        String lower = s.toLowerCase();
        int i = 0 ; int  j = s.length() -1;

        while(i < j){
            char start = lower.charAt(i);
            char end = lower.charAt(j);
            // remove space and shit
            if (!Character.isLetterOrDigit(start)) {
                i++;
                continue;
            }

            if (!Character.isLetterOrDigit(end)) {
                j--;
                continue;
            }

            if(start != end){
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}