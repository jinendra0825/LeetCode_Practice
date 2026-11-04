class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //HashMap mai key value mai key-> sorted value dalenge and then value mai actual word
        //like aet -> ate

        int n = strs.length;

        HashMap<String , List<String>> map = new HashMap<>();


        // for(String str : strs){
        //     String temp = str;

        //     Arrays.sort(str.toCharArray());

        //     // mpp.put();
        // }

        for (String str : strs) {

            // String str = strs[i];

            int[] freq = new int[26];
            // int strLen = str.length();

            for (char ch : str.toCharArray()) {
                freq[ch - 'a']++;
            }

            StringBuilder key = new StringBuilder();

            for (int count : freq) {
                key.append(count).append("#");
            }

            map.putIfAbsent(key.toString(), new ArrayList<>());
            map.get(key.toString()).add(str);

           

        }

        return new ArrayList<>(map.values());

    }
}