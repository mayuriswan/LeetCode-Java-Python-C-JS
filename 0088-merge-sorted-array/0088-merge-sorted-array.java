class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if(n==0) return ;  

       for(int i =n;i>0;i--){
           nums1[m+i-1] = nums2[i-1];
       }
        Arrays.sort(nums1);
    }
}