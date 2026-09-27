class Solution {
    public boolean containsDuplicate(int[] nums) {

        boolean result=false;

        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            int ele = nums[i];

            if(set.contains(ele)){
                result = true;
                break;
            }
            else{
                set.add(ele);
            }
            
        }

        return result;
        
    }
}