class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // 1. Count frequency
        Map<Integer, Integer> map = new HashMap<>();

        for (int ele : nums) {
            if (map.containsKey(ele)) {
                map.put(ele, map.get(ele) + 1);
            } else {
                map.put(ele, 1);
            }
        }

        // 2. Min Heap
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        // 3. Put elements in heap
        for (int ele : map.keySet()) {

            int freq = map.get(ele);

            pq.add(new Pair(ele, freq));

            if (pq.size() > k) {
                pq.remove();
            }
        }

        // 4. Create answer
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            Pair p = pq.remove();
            ans[i] = p.ele;
        }

        return ans;
    }

    // Pair class
    public class Pair implements Comparable<Pair> {

        int ele;
        int freq;

        Pair(int ele, int freq) {
            this.ele = ele;
            this.freq = freq;
        }

       
        public int compareTo(Pair p) {
            return this.freq - p.freq;
        }
    }
}