# Reverse a String

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**, reverse the string.

 **Examples:** 

```
Input: s = "Geeks"
Output: "skeeG"

```

```
Input: s = "for"
Output: "rof"
```

```
Input: s = "a"
Output: "a"
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T15:40:36.732Z  

```java
//METHOD 2 - SUBMISSION 2 ; USING STRING BUILDER TO IMPORVE     COMPLEXITY

class Solution {
    public static String reverseString(String s) {
        
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
        
        
        
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reverse-a-string/1)