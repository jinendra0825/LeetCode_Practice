class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();

        for(int i = left; i <= right; i++){
            if(isSelfDigit(i)){
                ans.add(i);
            }
        }

        return ans;
    }

    private boolean isSelfDigit(int num){
        int temp = num;

        while(temp > 0){
            int digit = temp % 10;

            if(digit == 0){
                return false;
            }

            if(num % digit != 0){
                return false;
            }

            temp = temp / 10;
        }

        return true;
    }
}