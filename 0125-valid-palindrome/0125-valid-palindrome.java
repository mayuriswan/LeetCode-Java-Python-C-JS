class Solution {
    public boolean isPalindrome(String s) {
            String s1 = s.toLowerCase();
            String s2 = s1.replaceAll("[^a-z0-9]","");
            char [] car = s2.toCharArray();
            int right = s2.length()-1;
            int left = 0 ; 
            while(left<right){
                if(car[left++]!=car[right--]){
                    return false ;
                }
            }
            return true ; 
    }
}