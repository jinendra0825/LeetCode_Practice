class Solution {
    public int titleToNumber(String columnTitle) {
        int sum =0 ;
        
        for (int i = 0 ; i < columnTitle.length(); i++){
            char curr = columnTitle.charAt(i);
            
            sum = sum * 26 + (curr - 'A' + 1);
        }

        return sum;
    }
}