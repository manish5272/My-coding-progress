# Number of Segments in a String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, return  *the number of segments in the string*.

A  **segment**  is defined to be a contiguous sequence of  **non-space characters**.

 

 **Example 1:** 

```
Input: s = "Hello, my name is John"
Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]

```

 **Example 2:** 

```
Input: s = "Hello"
Output: 1

```

 

 **Constraints:** 

- 0 <= s.length <= 300
- s consists of lowercase and uppercase English letters, digits, or one of the following characters "!@#$%^&*()_+-=',.:".
- The only space character in s is ' '.

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.6 MB  
**Submitted:** 2026-09-18T20:39:56.262Z  

```java
class Solution {
    public int countSegments(String s) {

        String sorted = s.trim();
        int count=1;

        for(int i =0 ;i<s.length()-1;i++){
            
            if(sorted.length()==0){
                count=0;
                break;
            }
            
            else if(sorted.charAt(i) == ' '){
                count++; 
            }
            
        }

        return count;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/number-of-segments-in-a-string/)