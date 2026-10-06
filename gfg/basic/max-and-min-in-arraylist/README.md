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
**Submitted:** 2026-10-06T16:19:55.493Z  

```java
class Solution {
    public static int maximumElement(ArrayList<Integer> arr) {
        
        int max=arr.get(0);
        for(int i=0;i<arr.size();i++){
            int current = arr.get(i);
            if(current > max){
                max = arr.get(i);
            }
        }
        
        return max;
        
    }

    public static int minimumElement(ArrayList<Integer> arr) {
        
        int min=arr.get(1);
        
        for(int i=0;i<arr.size();i++){
            int current = arr.get(i);
            if(current < min){
                min = arr.get(i);
            }
        }
        
        return min;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/max-and-min-in-arraylist/1)