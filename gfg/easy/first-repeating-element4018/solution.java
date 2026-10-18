class Solution {
    public int firstRepeated(int[] arr) {
        
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int ele = arr[i];
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        
        for(int i=0;i<arr.length;i++){
            
            int e =arr[i];
            if(map.get(e) >= 2){
                
                return i+1;
            }
        }
        
        return -1;
        
    }
}
