class Solution {
    public int maxDistance(int[] arr) {
        int n = arr.length;
        int ans = 0;
        
        for(int j = n -1; j >= 0; j--){
            if (arr[j] != arr[0]) {
                ans = Math.max(ans, j - 0);
                break;
            }
        }

        for(int i = 0 ; i < n; i++){
            if(arr[i] != arr[n-1]){
                ans = Math.max(ans, (n -1) - i);
                break;
            }
        }

        return ans;
    }
}