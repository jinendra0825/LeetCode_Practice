class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a , b) -> b - a); //Max Heap

        for(int num : stones){
            pq.offer(num);
        }

        while(pq.size() > 1){
            int curr = pq.poll();
            int next = pq.poll();

            if(curr != next){
                pq.offer(curr - next);
            }


        }

        return pq.isEmpty() ? 0 : pq.peek();


    }
}