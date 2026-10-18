# Single Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a  **non-empty**  array of integers `nums`, every element appears  *twice*  except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

 **Example 1:** 

 **Input:**  nums = [2,2,1]

 **Output:**  1

 **Example 2:** 

 **Input:**  nums = [4,1,2,1,2]

 **Output:**  4

 **Example 3:** 

 **Input:**  nums = [1]

 **Output:**  1

 

 **Constraints:** 

- 1 <= nums.length <= 3 * 104
- -3  *104 <= nums[i] <= 3*  104
- Each element in the array appears twice except for one element which appears only once.

## Solution

**Language:** Java  
**Runtime:** 13 ms (beats 19.53%)  
**Memory:** 46.5 MB (beats 97.54%)  
**Submitted:** 2026-09-23T17:04:56.514Z  

```java
import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){

            int k=nums[i];
            map.put(k,map.getOrDefault(k,0)+1);
        }

        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue() == 1){
                return e.getKey();
            }
        }

        return -1;

        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/single-number/)