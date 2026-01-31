class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[256];

        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        List<Character>[] bucket = new ArrayList[s.length() + 1];
        for (int c = 0; c < 256; c++) {
            int f = freq[c];
            if (f > 0) {
                if (bucket[f] == null)
                    bucket[f] = new ArrayList<>();
                bucket[f].add((char) c);
            }
        }

        StringBuilder ans = new StringBuilder();

        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null) {
                for (char c : bucket[i]) {
                    for (int k = 0; k < i; k++) {
                        ans.append(c);
                    }
                }
            }
        }

        return ans.toString();

    }

}