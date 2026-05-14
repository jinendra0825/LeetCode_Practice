class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
        );
        HashSet<Integer> set = new HashSet<>();


        for(int i = 0 ; i < nums.length ; i++){

            if(set.contains(nums[i])) continue;

            set.add(nums[i]);
            pq.offer(nums[i]);

            if(pq.size() > 3){
                pq.poll();
            }
        }


        if (pq.size() < 3) {   // Are bhai vo pehle max store kar raha hai or min ko pop kar raha hai.
        // Agar third nahi mila to pura queue khali karke last wala element dena padega jo ki MAX hai.


            while (pq.size() > 1) {
                pq.poll();
            }

            return pq.peek();
        }

        return pq.peek();
    }
}