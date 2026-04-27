class Solution {
    public int[] plusOne(int[] digits) {
        // thoda tricky que hai
        // agar last digit 9 nahi hai to digit + 1 karke return karo

        // jab tak last digit < 9 nahi hota taktak ke sare elements 0 banao;
        // or 9se chota mil gaya to use ++ karke udhar se hi return karo;



        
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0; 
        }

        // agar sare 9 hai to new array banao size + 1 ka or uska sirf first element 1 kardo, 
        // vaise bhi new array banane ke baad sare elements 0 hi hote hai;


        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }
}