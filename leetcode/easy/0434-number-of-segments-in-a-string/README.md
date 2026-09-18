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
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.3 MB (beats 92.76%)  
**Submitted:** 2026-09-18T20:51:18.813Z  

```java
class Solution {
    public int countSegments(String s) {
        String s1 = s.trim();
        int count=1;
        if(s1.length()==0){
            count=0;
            
        }
        else{
            for(int i=0;i<s1.length();i++){
            
                
                 if(s1.charAt(i) == ' ' && s1.charAt(i+1) != ' '){
                    count++;
                }

            }
        }

        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/number-of-segments-in-a-string/)