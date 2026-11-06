//METHOD 2 - SUBMISSION 2 ; USING STRING BUILDER TO IMPORVE     COMPLEXITY

class Solution {
    public static String reverseString(String s) {
        
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
        
        
        
        
    }
}