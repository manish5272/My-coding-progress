# Find All Duplicates in an Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums` of length `n` where all the integers of `nums` are in the range `[1, n]` and each integer appears  **at most**   **twice**, return  *an array of all the integers that appears  **twice***.

You must write an algorithm that runs in `O(n)` time and uses only  *constant*  auxiliary space, excluding the space needed to store the output

 

 **Example 1:** 

```
Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]

```

 **Example 2:** 

```
Input: nums = [1,1,2]
Output: [1]

```

 **Example 3:** 

```
Input: nums = [1]
Output: []

```

 

 **Constraints:** 

- n == nums.length
- 1 <= n <= 105
- 1 <= nums[i] <= n
- Each element in nums appears once or twice.

## Solution

**Language:** Java  
**Runtime:** 28 ms (beats 17.09%)  
**Memory:** 70.2 MB (beats 34.55%)  
**Submitted:** 2026-09-29T16:54:14.906Z  

```java
class Solution {
    public List<Integer> findDuplicates(int[] nums) {

    HashMap<Integer,Integer> map = new HashMap<>(nums.length);

    for(int i=0 ;i<nums.length;i++){
        int ele = nums[i];
        
        map.put(ele,map.getOrDefault(ele,0)+1);
    }

    ArrayList<Integer> list = new ArrayList<>();

    for(Map.Entry<Integer,Integer>  e:map.entrySet()){

        if(e.getValue() > 1){
            list.add(e.getKey());
        }
    }

    return list;

        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-all-duplicates-in-an-array/)