public class Solution {
    public IList<IList<int>> ThreeSum(int[] nums) {
        IList<IList<int>> res = new List<IList<int>>(); // Corrected initialization
        Array.Sort(nums);  // Sort the array

        for (int i = 0; i < nums.Length - 2; i++) { // Adjusted condition for triplet
            int a = nums[i];
            if (i > 0 && a == nums[i - 1]) { // Skip duplicates for `a`
                continue; 
            }

            int right = nums.Length - 1, left = i + 1;
            while (left < right) { // Fixed condition (left should be less than right)
                int sum = nums[right] + nums[left] + a; 
                if (sum == 0) {
                    // Add the triplet to the result
                    res.Add(new List<int> { nums[i], nums[left], nums[right] });

                    // Move left and right pointers, skipping duplicates
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // Move left pointer to increase the sum
                } else {
                    right--; // Move right pointer to decrease the sum
                }
            }
        }
        
        return res; // Return the result
    }
}
