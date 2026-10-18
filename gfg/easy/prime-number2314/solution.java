class Solution {
    static boolean isPrime(int n) {
        boolean res = true;
        
        if(n==1){
            return false;
        }
        
        for(int i = 2 ; i<n ;i++){
            if(n%i==0){
                res = false;
                break;
                
            }
        }
        
        return res;
        
    }
}