class Solution {
    public int maxArea(int[] height) {
        int result = 0 ; 
        int l = 0 , r = height.length-1; 

        while(l<r){
            int min = Math.min(height[l], height[r]); 
            int distance = r-l ; 
            int current  = min*distance;
            if(result <current){
                
                result = current;
            }
            if(height[l]>height[r]){
                r--;
            }else{
                l++;
            }

        }
        return result ; 
    }
}