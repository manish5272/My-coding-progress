class Solution {
    boolean isPalindrome(String s) {
        
        int i=0;
        int j=s.length()-1;
        boolean isPali=true;
        
        while(i<j){
            
            
            if(s.charAt(i)!=s.charAt(j)){
                isPali = false;
                break;
            }
            
            else{
                
                i++;
                j--;
                
            }
        }
        return isPali;
        
    }
}