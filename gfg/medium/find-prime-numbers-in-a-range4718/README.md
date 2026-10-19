# Primes in a Range

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two integers **l**  and  **r**, find and return all prime numbers in the range  **[l, r]**  (inclusive).

 **Examples:** 

```
Input: l = 1, r = 10
Output: [2, 3, 5, 7]
Explanation:
The prime numbers between 1 and 10 are 2, 3, 5 and 7.
```

```
Input: l = 2, r = 5
Output: [2, 3, 5]
Explanation:
The prime numbers between 2 and 5 are 2, 3 and 5.
```

 **Constraints:** 
1≤ l ≤ r ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-19T20:10:31.816Z  

```java
class Solution {
    public List<Integer> primeRange(int l, int r) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = l ; i<=r ;i++){
            
            
            int n = i;
            boolean isPrime = true;
            
            
            if(n<=1){
                
                 isPrime=false;
            }
            
            else{
            
            for(int j = 2 ; j <= Math.sqrt(n);j++){
                
                if(n % j == 0){
                    isPrime=false;
                    break;
                    }
                
                }
            }
            
            if(isPrime){
                list.add(n);
            }
            
            
            
            
        }
        return list;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-prime-numbers-in-a-range4718/1)