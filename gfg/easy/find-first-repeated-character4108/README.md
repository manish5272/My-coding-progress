# First Repeated Character

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**. The task is to find the first repeated character in it. We need to find the character that occurs more than once and whose index of second occurrence is smallest. s contains only  **lowercase**  letters.

 **Examples :** 

```
Input: s ="geeksforgeeks"
Output: "e"
Explanation: 'e' repeats at third position.
```

```
Input: s ="hellogeeks"
Output: "l"
Explanation: 'l' repeats at fourth position.
```

```
Input: s ="abc"
Output: "-1"
Explanation: There is no repeated character.
```

 **Constraints:** 
1 ≤ s.size() ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-13T17:06:52.607Z  

```java
class Solution {
    String firstRepChar(String s) {
        HashSet<Character> set = new HashSet<>();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(set.contains(ch)){
                
                
                return s.substring(i,i+1);
            }
            set.add(ch);
        }
        s="-1";
        return s;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-first-repeated-character4108/1)