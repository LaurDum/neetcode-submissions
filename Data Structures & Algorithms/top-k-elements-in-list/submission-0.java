class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int n : nums) {
            counts.merge(n, 1, Integer::sum);
        }
        PriorityQueue<Integer> heap =
            new PriorityQueue<>((a, b) -> counts.get(a) - counts.get(b));

        for (int num : counts.keySet()) {
            heap.add(num);
            if (heap.size() > k) {
                heap.poll(); 
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = heap.poll();
        }
        return result;
    }
}