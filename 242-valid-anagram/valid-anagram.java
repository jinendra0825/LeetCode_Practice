class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

       int freq[] = new int [26]; 

       for(int i=0 ; i < s.length() ; i ++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
       }

       int sum =0;

       for(int i = 0 ; i < 26; i++){
            if (freq[i] != 0) return false;
       }

       return true;
    }
}



// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if (s.length() != t.length()) return false;

//         char[] a = s.toCharArray();
//         char[] b = t.toCharArray();

//         Arrays.sort(a);
//         Arrays.sort(b);

//         return Arrays.equals(a, b);
//     }
// }
