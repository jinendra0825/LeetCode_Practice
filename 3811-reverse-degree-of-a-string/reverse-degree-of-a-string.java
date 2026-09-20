class Solution {

    public int reverseDegree(String s) {

        int sum = 0;
        for(int i = 1 ; i <= s.length(); i++){
            char curr = s.charAt(i-1);
            
            int prod = i * Math.abs(curr - 'a' - 26) ;

            sum += prod;

        }

        return sum;
    }
}