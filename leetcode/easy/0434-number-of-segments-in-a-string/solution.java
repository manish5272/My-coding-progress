class Solution {
    public int countSegments(String s) {
        String s1 = s.trim();
        int count=1;
        if(s1.length()==0){
            count=0;
            
        }
        else{
            for(int i=0;i<s1.length();i++){
            
                
                 if(s1.charAt(i) == ' ' && s1.charAt(i+1) != ' '){
                    count++;
                }

            }
        }

        return count;
    }
}