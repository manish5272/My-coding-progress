# Find The Least Frequent Digit

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `n`, find the digit that occurs  **least**  frequently in its decimal representation. If multiple digits have the same frequency, choose the  **smallest**  digit.

Return the chosen digit as an integer.

The  **frequency**  of a digit `x` is the number of times it appears in the decimal representation of `n`.

 

Original
Java
 **Example 1:** 

 **Input:**  n = 1553322

 **Output:**  1

 **Explanation:** 

The least frequent digit in `n` is 1, which appears only once. All other digits appear twice.

 **Example 2:** 

 **Input:**  n = 723344511

 **Output:**  2

 **Explanation:** 

The least frequent digits in `n` are 7, 2, and 5; each appears only once.

 

 **Constraints:** 

- 1 <= n <= 231​​​​​​​ - 1

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 54.98%)  
**Memory:** 42.3 MB (beats 68.45%)  
**Submitted:** 2026-11-21T14:14:53.674Z  

```java
class Solution {
    public int getLeastFrequentDigit(int n) {
        String s = String.valueOf(n);
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        int minFreq = Integer.MAX_VALUE;
        char ans = arr[0];
        int count = 1;

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] == arr[j - 1]) {
                count++;
            } else {
                if (count < minFreq) {
                    minFreq = count;
                    ans = arr[j - 1];
                }
                count = 1;
            }
        }

        // Check the final group of digits at the end of the array
        if (count < minFreq) {
            ans = arr[arr.length - 1];
        }

        return ans - '0';
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-the-least-frequent-digit/)