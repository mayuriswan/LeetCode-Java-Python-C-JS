class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
    //     if(n==0) return ;  

    //    for(int i =0;i<n;i++){
    //        nums1[m+i] = nums2[i];
    //    }
    //     Arrays.sort(nums1);
            int  r = n-1;
            int l = m-1;
            int b = m+n-1;
            while(r>=0){
                    if(l>=0&&nums1[l]>nums2[r]){
                        nums1[b--]=nums1[l--];
                    }else{
                        nums1[b--]=nums2[r--];
                    }
            }
             

    }
}