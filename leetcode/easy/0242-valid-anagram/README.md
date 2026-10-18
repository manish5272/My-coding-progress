# Valid Anagram

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

 

 **Example 1:** 

 **Input:**  s = "anagram", t = "nagaram"

 **Output:**  true

 **Example 2:** 

 **Input:**  s = "rat", t = "car"

 **Output:**  false

 

 **Constraints:** 

- 1 <= s.length, t.length <= 5 * 104
- s and t consist of lowercase English letters.

 

 **Follow up:**  What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 83.76%)  
**Memory:** 46.7 MB (beats 15.80%)  
**Submitted:** 2026-09-21T14:36:19.650Z  

```java
class Solution {
    public boolean isAnagram(String s, String t) {
       boolean isanagram = false;

       char[] sA = s.toCharArray();
       char[] tA = t.toCharArray();


       Arrays.sort(sA);
       Arrays.sort(tA);

       if(Arrays.equals(sA,tA)){
        isanagram = true;
       }
       

       return isanagram;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-anagram/)