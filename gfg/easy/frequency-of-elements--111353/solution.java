import java.util.*;

class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequencies using the map
        for (int i = 0; i < arr.length; i++) {
            int k = arr[i];
            map.put(k, map.getOrDefault(k, 0) + 1);
        }

        // Step 2: Correct declaration for a nested ArrayList
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        

        // Step 3: Correct loop syntax to iterate through a HashMap
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            
            ArrayList<Integer> pair = new ArrayList<>();
            
            pair.add(entry.getKey());
            pair.add(entry.getValue());
            
            
            result.add(pair);
            
            
            
            
        }
        
        return result;
    }
}