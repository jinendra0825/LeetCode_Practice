class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        // int [] sum = new int[nums.length];

        // //Sabka Sum find kar diya
        // for(int i = 0; i < n ; i++){
        //     sum[i] = getSum(nums[i]);
        // }

        // //Aab swap check karna hai;

        // int left = 0;
        // int right = n-1;

        // int swap = 0;

        // while(left < right){
        //     if(sum[left] > sum[right]){
        //         swap++;
        //     }else if(sum[left] == sum[right]){
        //         if(nums[left] > nums[right]){
        //             swap++;
        //         }
        //     }

        //     left++;

        //     right--;
        // }
        // return swap;


    // ----------------------TLE------------------
        // int[][] arr = new int[n][2];
        // //0 pe actual value & 1 pr sum.
        // for (int i = 0; i < n; i++) {
        //     arr[i][0] = nums[i];
        //     arr[i][1] = getSum(nums[i]);
        // }

        // //Comparator use karke 2d array ko sort kiya
        // // pehle sum ko sort kiya is clash then by number
        // Arrays.sort(arr, (a, b) -> {
        //     if (a[1] != b[1]) {
        //         return Integer.compare(a[1], b[1]);
        //     }
        //     return Integer.compare(a[0], b[0]);
        // });


        // int[] sorted = new int[n];
        // for (int i = 0; i < n; i++) {
        //     sorted[i] = arr[i][0];
        // }

        // int swaps = 0;

        // for (int i = 0; i < n; i++) {
        //     if (nums[i] == sorted[i]) {
        //         continue;
        //     }

        //     int j = i + 1;
        //     while (j < n && nums[j] != sorted[i]) {
        //         j++;
        //     }

        //     int temp = nums[i];
        //     nums[i] = nums[j];
        //     nums[j] = temp;

        //     swaps++;
        // }

        // return swaps;

        int[][] arr = new int[n][3];

        // Store: number, digit sum, original index
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = getSum(nums[i]);
            arr[i][2] = i;
        }

        // Sort by digit sum, then by number
        Arrays.sort(arr, (a, b) -> {
            if (a[1] != b[1]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || arr[i][2] == i) {
                continue;
            }

            int cycleLength = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                j = arr[j][2];
                cycleLength++;
            }

            if (cycleLength > 1) {
                swaps += cycleLength - 1;
            }
        }

        return swaps;

    }

    public int getSum(int num){
        int sum = 0 ;

        while(num > 0){
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }

        return sum;
    }

}