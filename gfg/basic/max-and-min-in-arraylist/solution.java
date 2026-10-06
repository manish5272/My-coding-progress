import java.util.*;

class Solution {
    public static int maximumElement(ArrayList<Integer> arr) {
        
        
        
        int maxValue = Collections.max(arr);
        
        return maxValue;
        
    }

    public static int minimumElement(ArrayList<Integer> arr) {
        
        int minValue = Collections.min(arr);
        
        return minValue;
    }
}
