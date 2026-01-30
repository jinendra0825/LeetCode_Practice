// class Solution {
//     public boolean isIsomorphic(String s, String t) {

//         if(s.length() != t.length()){
//             return false;
//         }

//         HashMap <Character , Character> mpp = new HashMap<>();
//         HashMap <Character , Character> mst = new HashMap<>();

//         for(int i =0 ; i < s.length() ; i++){
            

//             if(mpp.containsKey(s.charAt(i))){
//                 if(mpp.get(s.charAt(i)) != t.charAt(i)) return false;
//             }else{
//                 mpp.put(s.charAt(i) ,  t.charAt(i));
//             }

//             if(mst.containsKey(t.charAt(i))){
//                 if(mst.get(t.charAt(i)) != s.charAt(i)) return false;
//             }else{
//                 mst.put(t.charAt(i) ,  s.charAt(i));
//             }
//         }


//         return true;




//     }
// }



class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) return false;

        int[] mapST = new int[256];
        int[] mapTS = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (mapST[c1] == 0 && mapTS[c2] == 0) {
                mapST[c1] = c2;
                mapTS[c2] = c1;
            } else {
                if (mapST[c1] != c2 || mapTS[c2] != c1) {
                    return false;
                }
            }
        }

        return true;
    }
}

