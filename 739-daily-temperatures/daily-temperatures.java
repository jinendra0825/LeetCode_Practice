class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int n = temperatures.length;
        int ans[] = new int[n];

        if(n == 1) return new int[] {0};

        Stack <Integer> st = new Stack<>();
        st.push(0);

        for(int i = 0 ; i < n; i++){
            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]){
                int index = st.pop();
                ans[index] = i - index;
            }

            st.push(i);
        }

        return ans;


    }
}