class Solution {
    String firstRepChar(String s) {
        HashSet<Character> set = new HashSet<>();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(set.contains(ch)){
                
                
                return s.substring(i,i+1);
            }
            set.add(ch);
        }
        s="-1";
        return s;
        
    }
}