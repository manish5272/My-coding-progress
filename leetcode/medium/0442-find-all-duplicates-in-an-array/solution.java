class Solution {
    public List<Integer> findDuplicates(int[] nums) {

    HashMap<Integer,Integer> map = new HashMap<>(nums.length);

    for(int i=0 ;i<nums.length;i++){
        int ele = nums[i];
        
        map.put(ele,map.getOrDefault(ele,0)+1);
    }

    ArrayList<Integer> list = new ArrayList<>();

    for(Map.Entry<Integer,Integer>  e:map.entrySet()){

        if(e.getValue() > 1){
            list.add(e.getKey());
        }
    }

    return list;

        
    }
}