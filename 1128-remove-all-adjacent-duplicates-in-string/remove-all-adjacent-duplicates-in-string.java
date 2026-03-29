class Solution {
    public String removeDuplicates(String s) {
        Stack <Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();


        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);

            if(!st.isEmpty() && curr == st.peek()){
                st.pop();
            }         
            else {
                st.push(curr);
            }
           
        }

        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        

        return ans.reverse().toString();


        
    }
}