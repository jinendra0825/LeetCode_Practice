class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> set = new HashSet<>();

        for(int i = 0 ; i < s.length() ; i++){
            char curr = s.charAt(i);

            if(set.contains(curr)){
                return curr;
            }else{
                set.add(curr);
            }
        }

        return 'a';
    }
}