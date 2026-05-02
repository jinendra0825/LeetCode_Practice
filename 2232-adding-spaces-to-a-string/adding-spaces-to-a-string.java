class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder st = new StringBuilder();
        int j = 0;

        for(int i = 0 ; i < s.length(); i++){
            char curr = s.charAt(i);

            if(j < spaces.length  && spaces[j] == i){
                st.append(' ');
                j++;
            }
            st.append(curr);
        }

        return st.toString();
    }
}