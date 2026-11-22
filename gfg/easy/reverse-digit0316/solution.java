class Solution {
    public int reverseDigits(int n) {
        // Code here
        String s="";
        while(n>0){
            int last = n %10;
            s=s+String.valueOf(last);
            n=n/10;
            
        }
        int ans = Integer.parseInt(s);
        
        return ans;
        
    }
}