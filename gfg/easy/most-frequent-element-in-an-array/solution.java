class Solution {
    public int mostFreqEle(int[] arr) {
        
        TreeMap<Integer,Integer> map = new TreeMap<>();
        
        for(int i=0;i<arr.length;i++){
            int ele = arr[i];
            
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        
        int max= 0;
        int maxKey=0;
        
        for(Map.Entry<Integer,Integer>   e:map.entrySet()){
            
            if(e.getValue() >= max){
                max=e.getValue();
                maxKey=e.getKey();
            }
            
        }
        
        return maxKey;
        
        
        

    }
}