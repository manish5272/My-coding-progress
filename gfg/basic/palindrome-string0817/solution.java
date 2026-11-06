//just for revvision for basic coding practice same code as tc and sc 

class Solution {
    boolean isPalindrome(String s) {
        
        if(s.length() <= 1){
            return true;
        }
        
        int i=0;
        int j=s.length()-1;
        
        while(i<j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        
        return true;
        
    }
}