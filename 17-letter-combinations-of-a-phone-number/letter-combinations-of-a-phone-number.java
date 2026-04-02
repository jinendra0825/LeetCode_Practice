class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        if(digits.length() == 0) return ans;

        String[] map = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };

        combinations("", digits, ans, map);
        return ans;
    }

    public void combinations(String p, String up, List<String> ans, String[] map){
        if(up.isEmpty()){
            ans.add(p);
            return;
        }

        int digit = up.charAt(0) - '0';
        String letters = map[digit];

        for(int i = 0; i < letters.length(); i++){
            combinations(p + letters.charAt(i), up.substring(1), ans, map);
        }
    }
}