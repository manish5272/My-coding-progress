# Frequency of Elements

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **`arr[]`**  of positive integers which may contain duplicate elements, return the  **frequency**  of each distinct element.

 **Examples:** 

```
Input: arr[] = [1, 2, 2, 3, 3, 5]
Output: [[1, 1], [2, 2], [3, 2], [5, 1]]
Explaiantion: Here element 1 and 5 occur 1 times, 2 and 3 occur 2 times.

```

```
Input: arr[] = [1, 5, 6, 7, 7]
Output: [[1, 1], [5, 1], [6, 1], [7, 2]]
Explanation: Here element 1, 5 and 6 occur 1 times, 7 occur 2 times.
```

 **Constraints:** 
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-22T08:58:57.523Z  

```java
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
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/frequency-of-elements--111353/1)