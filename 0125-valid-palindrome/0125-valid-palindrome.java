class Solution {
    public boolean isPalindrome(String s) {
            // String s1 = s.toLowerCase();
            // String s2 = s1.replaceAll("[^a-z0-9]","");
            // char [] car = s2.toCharArray();
            // int right = s2.length()-1;
            // int left = 0 ; 
            // while(left<right){
            //     if(car[left++]!=car[right--]){
            //         return false ;
            //     }
            // }
            // return true ; 
             int left = 0, right = s.length() - 1;
    while (left < right) {
        // Skip non-alphanumeric characters
        while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
            left++;
        }
        while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
            right--;
        }
        // Compare characters (ignoring case)
        if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
            return false;
        }
        left++;
        right--;
    }
    return true;
    }
}