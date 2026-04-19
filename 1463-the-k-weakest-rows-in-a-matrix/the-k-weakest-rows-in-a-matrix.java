class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        // hum 2 size ke array mai arr[0] --> index save kar rahe hai
        // ans arr[1] par value store kar rahe hai.

    
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) ->{
            if(a[1] == b[1]) return b[0] - a[0];   //Are bhai ye special condition hai jab 2 value same hao to index ko compare karo.  
            return b[1] - a[1]; //iss line ka matlab hai geerally arr[1] se compare karo, naki arr[0] se.
        });  // b - a kiya kyuki max hume pehle chahiye

        // ans[2, 4, 1 , 2 , 5]
        for(int i= 0 ; i < mat.length; i++){
            int cnt =0;

            for(int j = 0 ; j < mat[i].length; j++){
                cnt += mat[i][j];
            }

            pq.offer(new int[]{
                i , cnt
            });

            if(pq.size() > k){
                pq.poll();
            }
            
        }

        int[] ans = new int[k];

        for (int i = k - 1; i >= 0; i--) { //why reverse? are bro max heap hai. iska matlab max pehle pop hoga to pq mai min rahega, isliye ulta extract karo.
            ans[i] = pq.poll()[0]; //[0] means maine jo array diya tha uska 0th index hi dena bas.
        }

        return ans;

        

    }


}