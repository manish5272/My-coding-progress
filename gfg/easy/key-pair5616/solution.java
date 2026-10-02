class Solution {
    boolean twoSum(int arr[], int target) {
        
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0;i<arr.length;i++){
            int current = arr[i];
            
            
            int required= target - current;
            
            if(set.contains(required)){
                return true;
            }
            
            else{
                set.add(current);
            }
        }
        
        return false;
        
        
    }
}