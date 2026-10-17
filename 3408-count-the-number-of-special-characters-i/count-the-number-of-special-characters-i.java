class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> set = new HashSet<>();

        for(char ch : word.toCharArray()){
            set.add(ch);
        }

        int charCount = 0;

        for(char ch : set){
            if(ch >= 'a' && ch <= 'z'){
                if(set.contains(Character.toUpperCase(ch))){
                    charCount++;
                }
            }
        }

        return charCount;
    }
}