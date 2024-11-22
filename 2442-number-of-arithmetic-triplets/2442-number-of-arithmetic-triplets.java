class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
    //     int result = 0 ; 
    //    for(int i = 0 ; i<nums.length;i++){
    //     for(int j = 1 ; j<nums.length;j++){
    //         if(nums[j]-nums[i]==diff){
    //             for(int k = j+1;k<nums.length;k++){
    //                 if(nums[k]-nums[j]==diff){
    //                     result++;
    //                     break;
    //                 }
                    
    //             }
    //         }
    //     }
    //    }
    //    return result;
         int result = 0;
        Map<Integer, Integer> set = new HashMap<>();

        // Populate the map with numbers from the array
        for (int num : nums) {
            set.put(num, 1);
        }

        // Check for arithmetic triplets
        for (int num : nums) {
            if (set.getOrDefault(num + diff, 0) == 1 && set.getOrDefault(num + diff + diff, 0) == 1) {
                result++;
            }
        }

        return result;
    }
}
