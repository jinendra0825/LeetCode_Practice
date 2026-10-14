class Solution {
    public String maxSumOfSquares(int num, int sum) {
        
        // int len = num;
        // int add = 0;

        // int currLen = 0;
        // int currSum = 0;

        // StringBuilder ans = new StringBuilder();

        // for(int i = 9 ; i >= 0; i--){

        //     // if(currSum > sum || currLen > len){
        //     //     break;
        //     // }

        //     if(currLen == len && currSum == sum){
        //         // return ans.toString();
        //         break;
        //     }

        //     if( i <= sum - currSum && currLen <= len){
        //         ans.append(i);
        //         currLen++;
        //         currSum += i;
        //     }
        // }

        // if(currSum == sum && currLen == num){
        //     return ans.toString();
        // }

        // return "";

        if (sum > 9 * num) return ""; // length * max digit < sum to vo digit ban hi nahi sakta.

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < num; i++) { // mujhe num times numbe chahiye isiye utne baar loop chalaya
            int digit = Math.min(9, sum); //check between sum and 9 which is smaller.  like 18, 9 -> 9 is smaller ---- but 2 , 9 then 2 is smaller
            ans.append(digit);
            sum -= digit; //reduce our sum
        }

        if (sum != 0) return "";

        return ans.toString();
    }
}