# Most Frequent in an Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array  **arr[]**. You need to return the element which  **occurs maximum times**  in  **arr[]**.
 **Note:**  If multiple such elements exists return the  **maximum**  element.

 **Example:** 

```
Input: arr[] = [1, 2, 2, 2, 4, 1]
Output: 2
Explanation: 2 is most frequent element of this array with 3 occurrences.
```

```
Input: arr[] = [1, -5, 8, 1]
Output: 1
Explanation: 1 is most frequent element of this array with 2 occurrences.
```

```
Input: arr[] = [3, 0, 0, 3, 8]
Output: 3
Explanation: 0 and 3 are two most frequent elements of this array. 3 is the maximum one.
```

 **Constraints:** 
1 ≤ arr.size() ≤ 105
-105 ≤ arr[i] ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-29T17:26:20.591Z  

```java
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
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/most-frequent-element-in-an-array/1)