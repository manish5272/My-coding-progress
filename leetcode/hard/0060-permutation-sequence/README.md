# Permutation Sequence

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

The set `[1, 2, 3,..., n]` contains a total of `n!` unique permutations.

By listing and labeling all of the permutations in order, we get the following sequence for `n = 3`:

- "123"
- "132"
- "213"
- "231"
- "312"
- "321"

Given `n` and `k`, return the `kth` permutation sequence.

 

 **Example 1:** 

```
Input: n = 3, k = 3
Output: "213"

```

 **Example 2:** 

```
Input: n = 4, k = 9
Output: "2314"

```

 **Example 3:** 

```
Input: n = 3, k = 1
Output: "123"

```

 

 **Constraints:** 

- 1 <= n <= 9
- 1 <= k <= n!

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 99.33%)  
**Memory:** 42.7 MB (beats 72.44%)  
**Submitted:** 2026-10-17T20:18:26.430Z  

```java
import java.util.ArrayList;
import java.util.List;

class Solution {
    public String getPermutation(int n, int k) {
        int fact = 1;
        List<Integer> numbers = new ArrayList<>();
        
       
        for (int i = 1; i < n; i++) {
            fact *= i;
        }
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        
        
        k = k - 1;
        StringBuilder ans = new StringBuilder();
        
        // 3. Mathematically extract each digit one by one
        while (true) {
            // Find the index of the next number to pick
            int idx = k / fact;
            ans.append(numbers.get(idx));
            
            // Remove the used number from the pool
            numbers.remove(idx);
            
            // Break when all numbers are picked
            if (numbers.isEmpty()) {
                break;
            }
            
            // Update k and calculate the next block size (factorial)
            k = k % fact;
            fact = fact / numbers.size();
        }
        
        return ans.toString();
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/permutation-sequence/)