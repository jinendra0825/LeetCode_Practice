class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if (a.freq == b.freq) {
                return b.a.compareTo(a.a);
            }
            return a.freq - b.freq;
        });

        //Pehle Map kar liya
        HashMap<String, Integer> mpp = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String curr = words[i];
            mpp.put(curr, mpp.getOrDefault(curr, 0) + 1);
        }

        // Aab PQ mai store kiya hai
        for (String ch : mpp.keySet()) {
            pq.offer(new Pair(ch, mpp.get(ch)));

            if (pq.size() > k) {
                pq.poll();
            }
        }

        List<String> ans = new ArrayList<>();

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            ans.add(0, curr.a);
        }

        return ans;

    }
}

class Pair {
    String a;
    int freq;

    Pair(String a, int freq) {
        this.a = a;
        this.freq = freq;
    }
}