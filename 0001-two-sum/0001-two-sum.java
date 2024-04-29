class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the numbers and their indices
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement of the current element exists in the map
            if (numMap.containsKey(complement)) {
                // If found, return the indices of the current element and its complement
                return new int[] {numMap.get(complement), i};
            }
            
            // If not found, put the current element and its index in the map
            numMap.put(nums[i], i);
        }
        // In case there is no solution, though the problem statement usually assumes there is one
        throw new IllegalArgumentException("No two sum solution");
    }
}