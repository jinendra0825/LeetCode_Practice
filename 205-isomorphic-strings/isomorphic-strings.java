class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap <Character , Character> mpp = new HashMap<>();
        HashMap <Character , Character> mst = new HashMap<>();

        for(int i =0 ; i < s.length() ; i++){
            

            if(mpp.containsKey(s.charAt(i))){
                if(mpp.get(s.charAt(i)) != t.charAt(i)) return false;
            }else{
                mpp.put(s.charAt(i) ,  t.charAt(i));
            }

            if(mst.containsKey(t.charAt(i))){
                if(mst.get(t.charAt(i)) != s.charAt(i)) return false;
            }else{
                mst.put(t.charAt(i) ,  s.charAt(i));
            }
        }


        return true;




    }
}