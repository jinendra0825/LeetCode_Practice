class Solution {
    public boolean detectCapitalUse(String word) {

        int capitalCount = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                capitalCount++;
            }
        }

        // All lowercase
        if (capitalCount == 0) {
            return true;
        }

        // All uppercase
        if (capitalCount == word.length()) {
            return true;
        }

        // Only first letter uppercase
        if (capitalCount == 1 &&
            word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') {
            return true;
        }

        return false;
    }
}