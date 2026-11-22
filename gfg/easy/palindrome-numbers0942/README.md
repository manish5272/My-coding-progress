# Palindrome Binary

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer  **n**, determine whether its binary representation forms a  **palindrome**. Return  **true**  if the binary representation of n is a palindrome; otherwise, return  **false**.

 **Note:** A binary representation is considered a palindrome if it reads the same forward and backward.

 **Examples:** 

```
Input: n = 17
Output: true
Explanation: Binary representation of 17 is (10001)2, which reads the same forward and backward, so it is a palindrome. 
```

```
Input: n = 16
Output: false
Explanation: Binary representation of 16 is (10000)2, which is not a palindrome. 

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-22T15:05:24.663Z  

```java
class Solution {
    public boolean isBinaryPalindrome(int n) {
        
        String binary = Integer.toBinaryString(n);
        
        int i=0;
        int j=binary.length() -1;
        
        while(i<j){
            if(binary.charAt(i) == binary.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        
        return true;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/palindrome-numbers0942/1)