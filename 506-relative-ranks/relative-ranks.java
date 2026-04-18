// // My Approach
// class Solution {
//     public String[] findRelativeRanks(int[] score) {
//         int n = score.length;

        
//         int[][] arr = new int[n][2];
//         for (int i = 0; i < n; i++) {
//             arr[i][0] = score[i]; // score
//             arr[i][1] = i;        // original index
//         }

        
//         Arrays.sort(arr, (a, b) -> b[0] - a[0]); //Array ko descending order mai sort kiya hai -> a[0][], b[0][], first element ke hisab se dec mai sort kiya hai

        
//         String[] ans = new String[n];

//         for (int i = 0; i < n; i++) {
//             int originalIndex = arr[i][1];

//             if (i == 0) {
//                 ans[originalIndex] = "Gold Medal";
//             } else if (i == 1) {
//                 ans[originalIndex] = "Silver Medal";
//             } else if (i == 2) {
//                 ans[originalIndex] = "Bronze Medal";
//             } else {
//                 ans[originalIndex] = String.valueOf(i + 1);
//             }
//         }

//         return ans;
//     }
// }


// using PQ:
class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;

        // Max Heap → sort by score descending
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> b[0] - a[0]
        );

        // Step 1: push (score, index)
        for (int i = 0; i < n; i++) {
            pq.offer(new int[]{score[i], i});
        }

        String[] ans = new String[n];
        int rank = 1;

        // Step 2: process heap
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int index = curr[1];

            if (rank == 1) {
                ans[index] = "Gold Medal";
            } else if (rank == 2) {
                ans[index] = "Silver Medal";
            } else if (rank == 3) {
                ans[index] = "Bronze Medal";
            } else {
                ans[index] = String.valueOf(rank);
            }

            rank++;
        }

        return ans;
    }
}