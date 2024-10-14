class Solution {
    public long maxKelements(int[] nums, int k) {
       long score = 0;  // Use long instead of int to avoid overflow

        // Create a max-heap (priority queue) to track the largest elements
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Add all elements of the array into the max-heap
        for (int i = 0; i < nums.length; i++) {
            maxHeap.add(nums[i]);
        }

        // Perform the operation k times
        for (int i = 0; i < k; i++) {
            // Extract the maximum element
            int max = maxHeap.poll();

            // Add the maximum to the score
            score += max;

            // Replace the max with ceil(max / 3)
            maxHeap.add((int) Math.ceil(max / 3.0));  // Properly divide by 3 and reinsert
        }

        return score;


    }
}