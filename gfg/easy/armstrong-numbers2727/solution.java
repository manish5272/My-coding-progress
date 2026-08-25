class Solution {
    static boolean armstrongNumber(int n) {
        int org=n;
        int temp;
        int arm=0;
        
        while(n>0){
            temp=n%10;
            temp=(int) Math.pow(temp,3);
            
            arm=arm+temp;
            
            n=n/10;
            
        }
        
        if(arm==org){
            return true;
        }
        else{
            return false;
        }
        
    }
}