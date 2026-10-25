class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        
        int wsum=0;
        int msum=Integer.MIN_VALUE;
        
        
        for(int i=0;i<k;i++){
            wsum=wsum+arr[i];
            msum=wsum;
        }
        
        for(int i=k;i<arr.length;i++){
            
            wsum=wsum+arr[i]-arr[i-k];
            
            msum=Math.max(wsum,msum);
        }
        
        return msum;
        
    }
}