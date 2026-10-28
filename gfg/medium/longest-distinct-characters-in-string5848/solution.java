class Solution {
    public int longestUniqueSubstr(String s) {
        
        HashSet<Character> set = new HashSet<>();
        
        int l=0;
        int r=l+1;
        int length=1;
        
        set.add(s.charAt(l));
        while(r<s.length()){
            
            if(set.contains(s.charAt(r))){
                set.clear();
                l=l+1;
                r=l+1;
                set.add(s.charAt(l));
            }
            else{
                
                set.add(s.charAt(r));
                r++;
                
                
                if(set.size() > length){
                    length=set.size();
                }
            }
            
        }
        return length;
        
    }
}