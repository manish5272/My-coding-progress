# Raise to Power of Its Own Reverse

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a number **n**, find the value of  **n**  raised to the power of its own reverse. The result will always fit into a 32-bit signed integer.

 **Examples:** 

```
Input: n = 2
Output: 4
Explanation: The reverse of 2 is 2, and.
```

```
Input: n = 10
Output: 10
Explanation: The reverse of 10 is 1 (leading zero is discarded), and 10 raised to the power 1 is 10.
```

 **Constraints:** 
1 ≤ n ≤ 10

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-27T19:30:09.456Z  

```java
class Solution {
    public int reverseExponentiation(int n) {
        
        int pow =n;
        int last;
        
        int rev =0;
        int res=1 ;
        
        while(pow>0){
            last = pow % 10 ;
            rev = rev * 10 + last;
            pow = pow / 10 ;
        }
        
        for(int i = 1 ; i <= rev ;i++){
            
            res = res * n;
        }
        
        return res;
        
        
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/power-of-numbers-1587115620/1)