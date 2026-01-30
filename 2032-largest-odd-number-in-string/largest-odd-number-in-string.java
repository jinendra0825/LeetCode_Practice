class Solution {
    public String largestOddNumber(String arr) {
       

        int n = arr.length();

        for(int i = n-1 ; i >= 0 ; i--){
            char ch = arr.charAt(i);

            if((ch - '0') % 2 == 1){
                return arr.substring(0 , i+1);
            }
        }

        return "";
        
    }
}