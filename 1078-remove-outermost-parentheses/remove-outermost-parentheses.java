class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int dep = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (dep > 0) {
                    result.append(ch);
                }
                dep++;
            } else {
                if (dep > 1) {
                    result.append(ch);
                }
                dep--;
            }
        }

        return result.toString();
    }
}



// Using deque
// class Solution {
//     public String removeOuterParentheses(String s) {

//         Deque<Character> dq = new ArrayDeque<>();
//         StringBuilder ans = new StringBuilder();

//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);

//             if (ch == '(') {
                
//                 if (!dq.isEmpty()) {
//                     ans.append(ch);
//                 }
//                 dq.addLast(ch);
//             } 
//             else { 
//                 dq.removeLast();
               
//                 if (!dq.isEmpty()) {
//                     ans.append(ch);
//                 }
//             }
//         }

//         return ans.toString();
//     }
// }