// Ye ques aache se nahi samjha bas flow flow mai ho gaya

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> comb = new ArrayList<>();

        combination(s, 0, ans, comb);


        return ans;

    }

    public static void combination(String s , int ind, List<List<String>> ans, List<String> comb){
        // Base case
        if(ind == s.length()){
            ans.add(new ArrayList<>(comb));
            return;
        }

       
        for(int end = ind;  end < s.length();   end++){
            String sub = s.substring (ind , end+1);

            if(isPalindrome(sub)){
                comb.add(sub);
                combination(s, end+1 , ans , comb);
                comb.remove(comb.size() -1);
            }
        }




    }

    public static boolean isPalindrome(String s){

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
          

            if (s.charAt(left) != s.charAt(right))
                return false;


            left++;
            right--;
        }


        return true;

    }
}