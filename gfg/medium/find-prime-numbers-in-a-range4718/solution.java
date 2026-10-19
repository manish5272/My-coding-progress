class Solution {
    public List<Integer> primeRange(int l, int r) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = l ; i<=r ;i++){
            
            
            int n = i;
            boolean isPrime = true;
            
            
            if(n<=1){
                
                 isPrime=false;
            }
            
            else{
            
            for(int j = 2 ; j <= Math.sqrt(n);j++){
                
                if(n % j == 0){
                    isPrime=false;
                    break;
                    }
                
                }
            }
            
            if(isPrime){
                list.add(n);
            }
            
            
            
            
        }
        return list;
        
    }
}