class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0) return 0 ;
     
        int counter = 0 ; 
        int l = nums.length-1;
        int s =0;
        while(s <= l){
            if(nums[s]==val){
                nums[s]=nums[l];
                nums[l--]=0;
                counter++;

            }else{
                s++;

            };
        };
        return nums.length-counter;
    }
}