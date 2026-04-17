import java.util.*;

class Solution {
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            
            if (map.containsKey(nums[i])) {
                int j = map.get(nums[i]);
                ans = Math.min(ans, i - j);
            }

            int rev = reverse(nums[i]);
            map.put(rev, i);
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    private int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        return rev;
    }
}

// My Solution --> Working but n2 complexity.

// class Solution {
//     public int minMirrorPairDistance(int[] nums) {
//         int reverseOfnums[] = reverseInteger(nums);
//         int ans = Integer.MAX_VALUE;

//         // [12 21 45 33 54]
//         // [21 12 54 33 45]

//         for(int i = 0 ; i < nums.length; i++){
//             for(int j = i + 1; j < nums.length; j++){
//                 if(reverseOfnums[i] == nums[j]){
                   
//                 int diff = Math.abs(i-j);
//                 ans = Math.min(ans, diff);
//             }
//           }
//         }

//         return ans == Integer.MAX_VALUE ? -1 : ans;

//     }

//     public int[] reverseInteger(int[] arr) {
//         int reverseArr[] = new int[arr.length];

//         for (int i = 0; i < arr.length; i++) {
//             int num = arr[i];
//             int rev = 0;
//             while (num > 0) {
//                 int digit = num % 10;

//                 rev = (rev * 10) + digit;

//                 num = num / 10;
//             }
//             System.out.print(rev + " ");
//             reverseArr[i] = rev;
//         }

//         return reverseArr;
//     }
// }