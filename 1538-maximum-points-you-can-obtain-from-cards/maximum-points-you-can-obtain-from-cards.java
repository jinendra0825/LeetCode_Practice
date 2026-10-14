class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length-1; 
        // int right = n;
        // int left = 0;
        // int sum = 0;
        // int currK = 0;
        // while(right < left){
        //     if(currK == k){
        //         break;
        //     }
        //     if(cardPoints[left] == cardPoints[right]){}

            
        //     if(cardPoints[right] > cardPoints[left]){
        //         sum += cardPoints[right];
        //         right--;
        //     }else{
        //         sum += cardPoints[left];
        //         left++;
        //     }
        // }

        // return 0;


        //Check from left k elements
        // int Leftsum = 0;
        // for(int i = 0 ; i < k ; i++){
        //     Leftsum += cardPoints[i];
        // }

        // int cnt =0;
        // int Rightsum = 0;
        // for(int i = n ; i >= 0 ; i--){
        //     if(cnt == k) break;
        //     Rightsum += cardPoints[i];
        //     cnt--;

        // }

        // int rightLeftSum = 0;
        int leftSum = 0;
        for(int i = 0 ; i < k ; i++){
            leftSum += cardPoints[i];
        }

        int max = leftSum;

        int rightSum = 0;

        int right = n;
        for(int i = k-1 ; i >= 0 ; i--){
            leftSum = leftSum - cardPoints[i];
            rightSum += cardPoints[right];
            right--;

            max = Math.max(max , rightSum + leftSum);
        }

        return max;

        

    }
}