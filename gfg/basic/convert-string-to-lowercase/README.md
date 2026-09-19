# Convert String to Lower Case

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**. The task is to convert string characters to  **lowercase**.

 **Examples:** 

```
Input: s = "ABCddE"
Output: "abcdde"
Explanation: A, B, C and E are converted to a, b, c and e thus all uppercase characters of the string converted to lowercase letter.
```

```
Input: s = "LMNOppQQ"
Output: "lmnoppqq"
Explanation: L, M, N, O, and Q are converted to l, m, n, o and q thus all uppercase characters of the string converted to lowercase letter.
```

 **Constraints:** 
1 ≤ s.size() ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-19T16:53:35.032Z  

```java
class Solution {
    static String toLower(String s) {
        
        
        String modified=s.toLowerCase();
        
        return modified;
        
        
        
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/convert-string-to-lowercase/1)