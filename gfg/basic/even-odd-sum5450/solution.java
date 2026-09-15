class Solution {
    public int[] evenOddSum(int[] arr) {
        
        
        int[] ans = new int[2];
        
        
        int odd_sum = 0;
        int even_sum= 0;
        
        for(int i = 0 ;i<arr.length;i++){
            
            
            int position = i+ 1;
            if(position % 2 != 0){
                odd_sum = odd_sum+arr[i];
            }
            else{
                even_sum = even_sum + arr[i];
            }
        }
        
        
        ans[0]=even_sum;
        ans[1]=odd_sum;
        
        return ans;
    }
}