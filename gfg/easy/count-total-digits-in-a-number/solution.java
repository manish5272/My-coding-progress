class Solution {
    public int countDigits(int n) {
        
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        if(count == 0){
            return 1;
        }
        
        return count;
        
    }
}