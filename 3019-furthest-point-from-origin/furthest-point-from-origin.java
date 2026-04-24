class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int cnt =0;
        for(int i = 0 ; i < moves.length() ; i++){
            
            char ch = moves.charAt(i);

            if(ch =='L'){
                cnt++;
            }else if(ch == 'R'){
                cnt--;
            }else {
                cnt++;
            }


        }

        int cnt2 =0;
        for(int i = 0 ; i < moves.length() ; i++){
            
            char ch = moves.charAt(i);

            if(ch =='L'){
                cnt2--;
            }else if(ch == 'R'){
                cnt2++;
            }else {
                cnt2++;
            }


        }

        return Math.max(Math.abs(cnt) , Math.abs(cnt2));
    }
}