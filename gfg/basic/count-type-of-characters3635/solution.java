class Sol {
    int[] count(String s) {
        
        int L=0;
        int U=0;
        int N=0;
        int S=0;
        
        ArrayList<Integer> list = new ArrayList();
        
        for(int i=0;i<s.length();i++){
            
            char l=s.charAt(i);
            if(Character.isUpperCase(l)){
                
                U++;
                
            }
            
            else if(Character.isLowerCase(l)){
                
                L++;
                
            }
            else if(Character.isDigit(l)){
                N++;
            }
            
            else{
                S++;
            }
        }
        
        int[] result = {U,L,N,S};
        
        return result;
    }
}