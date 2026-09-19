# Change the Case based on First Character

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**, the task is to change the complete string to uppercase or lowercase depending on the case of the first character.

 **Examples:** 

```
Input: s = "abCD"
Output: "abcd"
Explanation: The first letter (a) is lowercase. Hence, the complete string is made lowercase.

```

```
Input: s = "Abcd"
Output: "ABCD"
Explanation: The first letter (A) is uppercase. Hence, the complete string is made uppercase.
```

 **Constraints:** 
1<=|s|<=104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-19T16:40:15.313Z  

```java
import java.util.*;


class Solution {
    String modify(String s) {
        
        
        String modified="";
        
        if(s.length()>0 && Character.isUpperCase(s.charAt(0))){
            modified = s.toUpperCase();
        }
        
        else{
            modified = s.toLowerCase();
        }
        
        
        return modified;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/change-the-string3541/1)