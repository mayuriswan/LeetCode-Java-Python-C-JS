class Solution {
    public long maxKelements(int[] nums, int k) {
        long score =0;
        
                PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
                for(int i =0 ; i<nums.length;i++){
                    maxHeap.add(nums[i]);
                }
                for(int i = 0 ; i<k ; i++){
                    int max = maxHeap.poll();
                    score +=max ; 
            maxHeap.add((int) Math.ceil(max / 3.0));  // Re-insert ceil(ele / 3) into the queue
                }
                return score ;



    }
}