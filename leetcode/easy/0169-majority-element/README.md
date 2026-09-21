# Majority Element

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array `nums` of size `n`, return  *the majority element*.

The majority element is the element that appears more than `⌊n / 2⌋` times. You may assume that the majority element always exists in the array.

 

 **Example 1:** 

```
Input: nums = [3,2,3]
Output: 3

```

 **Example 2:** 

```
Input: nums = [2,2,1,1,1,2,2]
Output: 2

```

 

 **Constraints:** 

- n == nums.length
- 1 <= n <= 5 * 104
- -109 <= nums[i] <= 109
- The input is generated such that a majority element will exist in the array.

 

 **Follow-up:**  Could you solve the problem in linear time and in `O(1)` space?

## Solution

**Language:** Java  
**Runtime:** 28 ms (beats 8.85%)  
**Memory:** 57.5 MB (beats 6.73%)  
**Submitted:** 2026-09-21T15:09:55.019Z  

```java
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int ans=0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =  0 ;i<nums.length;i++){
            
            int e = nums[i];
            
            map.put(e, map.getOrDefault(e,0)+1);

            if(map.get(e) > nums.length/2 ){
                ans = e;
            }

        }

        return ans;

        


    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/majority-element/)