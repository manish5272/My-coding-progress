class Solution {
    public static int gcd(int a, int b) {
        
        while(a!=b){
            
            if(a==0){
                return b;
            }
            
            if(b==0){
                return a;
            }
            
            
            
            if(a>b){
                a=a-b;
            }
            if(b>a){
                b=b-a;
            }
        }
        
            return a;
        
    }
}
