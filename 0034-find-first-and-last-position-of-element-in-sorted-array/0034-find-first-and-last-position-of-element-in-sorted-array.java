class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
int counter = -1;
for(int i = 0; i < nums.length; i++) {
    if(nums[i] < target) {
        continue; 
    }
    if(nums[i] == target) {
        if(counter == -1) {
            result[0] = i; 
        }
        counter = i;
    }
    if(nums[i] > target) {
        break; 
    }
}
if(counter != -1) {
    result[1] = counter;
}
return result;
    }
}