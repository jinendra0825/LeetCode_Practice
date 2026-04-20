class Solution {
    public int maxDistance(int[] arr) {
        int i =0;
        int j = arr.length-1;
        int ans =0;

        while(i < j){
            int curr = arr[i];

            if(curr == arr[j]){
                j--;
            }else if(curr != arr[j]){
                ans = Math.max(ans , (j - i));
                i++;
                j = arr.length -1;
            }
        }

        return ans;
    }
}