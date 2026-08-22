class Solution {
    public int reverseDigits(int n) {
        int lastdigit;
        int reverse=0;
        
        while(n>0){
            lastdigit=n%10;
            reverse=reverse*10+lastdigit;
            n=n/10;
    
        }
        return reverse;
    }
}