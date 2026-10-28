# Longest Substring with Distinct Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string  **s**, find the length of the longest substring with all distinct characters. 

 **Examples:** 

```
Input: s = "geeksforgeeks"
Output: 7
Explanation: "eksforg" is the longest substring with all distinct characters.

```

```
Input: s = "aaa"
Output: 1
Explanation: "a" is the longest substring with all distinct characters.

```

```
Input: s = "abcdefabcbb"
Output: 6
Explanation: The longest substring with all distinct characters is "abcdef", which has a length of 6.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-28T21:40:38.072Z  

```java
class Solution {
    public int longestUniqueSubstr(String s) {
        
        HashSet<Character> set = new HashSet<>();
        
        int l=0;
        int r=l+1;
        int length=1;
        
        set.add(s.charAt(l));
        while(r<s.length()){
            
            if(set.contains(s.charAt(r))){
                set.clear();
                l=l+1;
                r=l+1;
                set.add(s.charAt(l));
            }
            else{
                
                set.add(s.charAt(r));
                r++;
                
                
                if(set.size() > length){
                    length=set.size();
                }
            }
            
        }
        return length;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/longest-distinct-characters-in-string5848/1)