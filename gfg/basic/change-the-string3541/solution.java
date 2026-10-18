import java.util.*;


class Solution {
    String modify(String s) {
        
        
        String modified="";
        
        if(s.length()>0 && Character.isUpperCase(s.charAt(0))){
            modified = s.toUpperCase();
        }
        
        else{
            modified = s.toLowerCase();
        }
        
        
        return modified;
        
    }
}