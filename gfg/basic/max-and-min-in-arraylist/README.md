# Max and Min In ArrayList

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer ArrayList  **arr[]**, return the  **maximum**  and  **minimum**  elements in the ArrayList.

 **Examples:** 

```
Input: arr[] = [5, 4, 2, 1]
Output: 5 1
Explanation: Maximum element is: 5. Minimum element is: 1
```

```
Input: arr[] = [8]
Output: 8 8
Explanation: Maximum element is: 8. Minimum element is: 8
```

 **Constraints:** 
1 ≤ arr.size() ≤ 105
0 ≤ arr[i] ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T16:06:57.330Z  

```java
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

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/max-and-min-in-arraylist/1)