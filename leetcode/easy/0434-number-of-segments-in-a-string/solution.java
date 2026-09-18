class Solution {
    public int countSegments(String s) {

        String sorted = s.trim();
        int count=1;

        for(int i =0 ;i<s.length()-1;i++){
            
            if((s.length()-1)==0){
                count=0;
                break;
            }
            
            else if(s.charAt(i) == ' '){
                count++; 
            }
            
        }

        return count;
        
    }
}