import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){

            int k=nums[i];
            map.put(k,map.getOrDefault(k,0)+1);
        }

        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue() == 1){
                return e.getKey();
            }
        }

        return -1;

        
    }
}