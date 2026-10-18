class Solution {
    String removeDuplicates(String s) {
        
        
        String result="";
        
        for(int i=0; i<s.length();i++){
    
            char ch = s.charAt(i);
            
            if (result.indexOf(ch) == -1) {
                            result += ch; 
                       
                       
             }
                
            }
            
        
        
        return result;
        
        
        
        
        
    }
}
