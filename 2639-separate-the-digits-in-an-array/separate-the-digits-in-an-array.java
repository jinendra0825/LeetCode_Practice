class Solution {
    public int[] separateDigits(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        for(int i = 0 ; i < nums.length; i++){
            extractDigits(nums[i] ,  ans);
        }

        int finalAns[] = new int[ans.size()];

        for(int i = 0 ; i < ans.size(); i++){
            finalAns[i] = ans.get(i);
        }

        return finalAns;
    }

    private void extractDigits(int num , List<Integer> ans){
        Stack<Integer> st = new Stack<>();

        while(num > 0){
            int digit = num % 10;
            st.push(digit);

            num = num / 10;
        }

        while(!st.isEmpty()){
            ans.add(st.pop());
        }
    }
}