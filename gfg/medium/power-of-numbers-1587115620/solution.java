class Solution {
    public int reverseExponentiation(int n) {
        
        int pow =n;
        int last;
        
        int rev =0;
        int res=1 ;
        
        while(pow>0){
            last = pow % 10 ;
            rev = rev * 10 + last;
            pow = pow / 10 ;
        }
        
        for(int i = 1 ; i <= rev ;i++){
            
            res = res * n;
        }
        
        return res;
        
        
    }
}
