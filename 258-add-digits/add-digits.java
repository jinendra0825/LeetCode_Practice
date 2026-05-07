class Solution {
    public int addDigits(int num) {
        if (num == 0) return 0;
        return 1 + (num - 1) % 9; // --> Are bhai jab multiple of 9 aayege to 18%9 = 0 aayega but answer 9 ana chahiye.
        // to hum num ko kabhi 9 ka multiple hone nahi dete. isliye 1 se - kiya

        
    }
}