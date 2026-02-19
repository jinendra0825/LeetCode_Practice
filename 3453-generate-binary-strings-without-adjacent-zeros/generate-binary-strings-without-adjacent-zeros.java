class Solution {
    public List<String> validStrings(int n) {
        List<String> ans = new ArrayList<>();

        backtrack (n , "" , ans);

        return ans;
    }

    public static void backtrack(int n , String curr , List<String> ans){

        if(curr.length() == n ){
            ans.add(curr);
            return;
        }

        backtrack(n , curr + "1" , ans);

        if(curr.length() == 0 || curr.charAt(curr.length() -1) != '0'){
            backtrack(n , curr + "0" , ans);
        }
    }
}