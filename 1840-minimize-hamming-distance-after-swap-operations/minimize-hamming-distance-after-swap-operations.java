import java.util.*;

class Solution {
    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
        int n = source.length;

        // Step 1: build graph
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] swap : allowedSwaps) {
            graph.get(swap[0]).add(swap[1]);
            graph.get(swap[1]).add(swap[0]);
        }

        boolean[] visited = new boolean[n];
        int mismatch = 0;

        // Step 2: find connected components
        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            List<Integer> group = new ArrayList<>();
            Queue<Integer> q = new LinkedList<>();

            q.offer(i);
            visited[i] = true;

            while (!q.isEmpty()) {
                int node = q.poll();
                group.add(node);

                for (int nei : graph.get(node)) {
                    if (!visited[nei]) {
                        visited[nei] = true;
                        q.offer(nei);
                    }
                }
            }

            // Step 3: process this group
            Map<Integer, Integer> freq = new HashMap<>();

            // count source values
            for (int idx : group) {
                freq.put(source[idx], freq.getOrDefault(source[idx], 0) + 1);
            }

            // match with target
            for (int idx : group) {
                if (freq.getOrDefault(target[idx], 0) > 0) {
                    freq.put(target[idx], freq.get(target[idx]) - 1);
                } else {
                    mismatch++;
                }
            }
        }

        return mismatch;
    }
}