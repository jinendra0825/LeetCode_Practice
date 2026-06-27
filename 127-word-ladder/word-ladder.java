class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        //Defining queue
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(beginWord , 1));

        // HashSet for quick acess
        Set<String> st = new HashSet<String>();
        int len = wordList.size();

        //Adding all words of Hash Set
        for(int i = 0 ; i < len ; i++){
            st.add(wordList.get(i));
        }

        st.remove(beginWord);

        //Chalo gear dalo aab

        while(!q.isEmpty()){
            String word = q.peek().first;
            int steps = q.peek().second;

            q.poll();

            if(word.equals(endWord)){
                return steps;
            }

            for(int i = 0 ; i < word.length(); i++){
                for(char ch = 'a'; ch <= 'z' ; ch++){
                    char replacedCharArray[] = word.toCharArray();
                    replacedCharArray[i] = ch;

                    String replacedWord = new String(replacedCharArray);

                    //Check if it exist in the set

                    if(st.contains(replacedWord)){
                        st.remove(replacedWord);
                        q.add(new Pair(replacedWord, steps + 1));
                    }
                }
            }
        }

        return 0;


    }
}

class Pair{
    String first;
    int second; 

    Pair(String first , int second){
        this.first = first;
        this.second = second;
    }
}