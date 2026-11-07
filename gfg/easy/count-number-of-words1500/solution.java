class Solution {
    public int countWords(String s) {
        // code here
        StringBuilder sb= new StringBuilder(s);
        
        s = s.replace("\n"," ");
        s = s.replace("\t"," ");
        

        s= s.trim();
        
        //REMOVING MULTIPLE SPACES INTO SINGLE SPACE
        
        s=s.replaceAll("\\s+"," ");
        
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch == ' '){
                count++;
            }
        }
        
        return count+1;
    }
}