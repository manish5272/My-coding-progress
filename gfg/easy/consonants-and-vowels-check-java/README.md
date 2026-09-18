# Check Consonants and Vowels

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a string  **s,**  containing only lowercase letters. Count the number of vowels and the number of consonants.

- If vowel count > consonant count then print - “Yes”(without quotes).
- If vowel count < consonant count then print - “No”(without quotes).
- If vowel count = consonant count then print - “Same”(without quotes).

 **Examples:** 

```
Input: s = thequickbrownfoxjumpsoverthelazydog
Output: No
```

```
Input: s = aaaaaa
Output: Yes

```

```
Input: s = abab
Output: Same
```

 **Constraints:** 
1 ≤ |s| ≤ 100
Where, |s| is the size of string.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-18T12:05:09.384Z  

```java
class Solution {

    static void checkString(String s) {
        int v = 0;
        int c = 0;

        for(int i = 0 ; i<s.length() ;i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'|| s.charAt(i) == 'u'){
                
                
                v++;
                
            }
            
            else{
                c++;
            }
        }
        
        if(v>c){
            System.out.println("Yes");
            
        }
        else if(v<c){
            System.out.println("No");
            
        }
        else{
            System.out.println("Same");
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/consonants-and-vowels-check-java/1)