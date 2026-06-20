class Solution {
    public int[] shortestToChar(String s, char c) {
        int ans[] = new int[s.length()];
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i = 0 ; i < s.length(); i++){
            char curr = s.charAt(i);

            if(curr == c){
                temp.add(i);
            }
        }

        for(int i = 0 ; i < s.length(); i++){

            int minDist = Integer.MAX_VALUE;

            for(int j  = 0 ; j < temp.size(); j++){
                minDist = Math.min(minDist,  Math.abs(i - temp.get(j)));

            }

            ans[i] = minDist;
        }

        return ans;
    }


}