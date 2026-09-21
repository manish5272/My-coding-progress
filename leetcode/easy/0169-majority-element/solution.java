class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int ans=0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =  0 ;i<nums.length;i++){
            
            int e = nums[i];
            
            map.put(e, map.getOrDefault(e,0)+1);

            if(map.get(e) > nums.length/2 ){
                ans = e;
            }

        }

        return ans;

        


    }
}