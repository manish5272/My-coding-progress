# Determine if String Halves Are Alike

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a string `s` of even length. Split this string into two halves of equal lengths, and let `a` be the first half and `b` be the second half.

Two strings are  **alike**  if they have the same number of vowels (`'a'`, `'e'`, `'i'`, `'o'`, `'u'`, `'A'`, `'E'`, `'I'`, `'O'`, `'U'`). Notice that `s` contains uppercase and lowercase letters.

Return `true` *if* `a` *and* `b` *are  **alike***. Otherwise, return `false`.

 

 **Example 1:** 

```
Input: s = "book"
Output: true
Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.

```

 **Example 2:** 

```
Input: s = "textbook"
Output: false
Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
Notice that the vowel o is counted twice.

```

 

 **Constraints:** 

- 2 <= s.length <= 1000
- s.length is even.
- s consists of uppercase and lowercase letters.

## Solution

**Language:** Java  
**Runtime:** 7 ms (beats 17.04%)  
**Memory:** 42.2 MB (beats 99.58%)  
**Submitted:** 2026-11-06T19:23:34.639Z  

```java
class Solution {
    public boolean halvesAreAlike(String s) {

        int i=0;
        int j=s.length()-1;
        int lcount=0;
        int rcount=0;

        Set<Character> set = Set.of('a','e','i','o','u','A','E','I','O','U');

        while(i<j){
            char lc = s.charAt(i);
            char rc = s.charAt(j);

            if(set.contains(lc)){
                lcount++;
            }
            if(set.contains(rc)){
                rcount++;
            }
            i++;
            j--;
        }
        if(lcount == rcount){
            return true;
        }
        return false;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/determine-if-string-halves-are-alike/)