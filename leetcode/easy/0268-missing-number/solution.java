class Solution {
    public int missingNumber(int[] nums) {

        int sum_miss= 0;
        int n = nums.length;
        int sum_act = (n*(n+1))/2;

        for(int i = 0 ; i< nums.length;i++){
            sum_miss = sum_miss + nums [i];
        }

        int result = sum_act-sum_miss;

        return result;





        
        
    }
}