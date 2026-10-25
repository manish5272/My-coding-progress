class Solution {
    public double findMaxAverage(int[] nums, int k) {


        int wavg=0;
        int wsum=0;
        int mavg=Integer.MIN_VALUE;
        int msum=0;

        for(int i=0;i<k;i++){
            
            wsum=wsum+nums[i];
            msum=wsum;
            
        }
        

        for(int i=k;i<nums.length;i++){

            wsum=wsum+nums[i]-nums[i-k];

            msum=Math.max(wsum,msum);

        }
        return (double)msum/k;
        
    }
}