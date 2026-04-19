class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums){
            pq.offer(num);

            if(pq.size() > 2){
                pq.poll();
            }
        }

        int first = pq.poll();
        int second = pq.poll();

        return (first - 1) * (second -1);
    }
}