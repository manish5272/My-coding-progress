# Palindrome String

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**, find if it is a palindrome. A string is considered a palindrome if it reads the same forwards and backwards.

 **Examples :** 

```
Input: s = "abba"
Output: true
Explanation: "abba" reads the same forwards and backwards, so it is a palindrome.
```

```
Input: s = "abc" 
Output: false
Explanation: "abc" does not read the same forwards and backwards, so it is not a palindrome.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-17T14:46:25.369Z  

```java
class Solution {
    boolean isPalindrome(String s) {
        
        int i=0;
        int j=s.length()-1;
        boolean isPali=true;
        
        while(i<j){
            
            
            if(s.charAt(i)!=s.charAt(j)){
                isPali = false;
                break;
            }
            
            else{
                
                i++;
                j--;
                
            }
        }
        return isPali;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/palindrome-string0817/1)