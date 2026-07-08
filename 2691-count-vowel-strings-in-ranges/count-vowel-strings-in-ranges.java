class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {

        int prefSum[] = new int[words.length];
        int ans[] = new int[queries.length];

        // first calculate the words which are vovelStrings

         for (int i = 0; i < words.length; i++) {
            if (checkVowelWord(words[i])) {
                prefSum[i] = 1;
            }
        }

        for (int i = 1; i < words.length; i++) {
            prefSum[i] += prefSum[i - 1];
        }

        // this will store prefSum --> [1, 0 , 1, 1, 1] -- for ex 1

        // now check the range and add the value and store it in the ans arr;

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            if (start == 0) {
                ans[i] = prefSum[end];
            } else {
                ans[i] = prefSum[end] - prefSum[start - 1];
            }
            
        }

        return ans;

    }

    public boolean checkVowelWord(String word) {

        char start = word.charAt(0);
        char end = word.charAt(word.length() - 1);

        return (start == 'a' || start == 'e' || start == 'i' || start == 'o' || start == 'u') &&
                (end == 'a' || end == 'e' || end == 'i' || end == 'o' || end == 'u');
    }
}