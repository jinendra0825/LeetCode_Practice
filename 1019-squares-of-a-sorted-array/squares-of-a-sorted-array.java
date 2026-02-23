class Solution {
    public int[] sortedSquares(int[] arr) {

        int right = arr.length-1;
        int left = 0;
        
        int [] ans = new int[arr.length];

        for(int i = arr.length-1 ; i >= 0 ; i--){

            if(Math.abs(arr[left]) < Math.abs(arr[right])){
                ans[i] = arr[right] * arr[right];
                right--;
            }else{

                ans[i] = arr[left] * arr[left];
                left++;

            }
        }

        return ans;
    }
}