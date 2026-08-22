# Max Circular Subarray Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

You are given a circular array  **`arr[]`** of integers, find the  **maximum**  possible sum of a non-empty  **subarray**. In a circular array, the subarray can start at the end and wrap around to the beginning. Return the maximum non-empty subarray sum, considering both non-wrapping and wrapping cases.

 **Examples:** 

```
Input: arr[] = [8, -8, 9, -9, 10, -11, 12]
Output: 22
Explanation: Starting from the last element of the array, i.e, 12, and moving in a circular fashion, we have max subarray as 12, 8, -8, 9, -9, 10, which gives maximum sum as 22.
```

```
Input: arr[] = [10, -3, -4, 7, 6, 5, -4, -1]
Output: 23
Explanation: Maximum sum of the circular subarray is 23. The subarray is [7, 6, 5, -4, -1, 10].

```

```
Input: arr[] = [5, -2, 3, 4]
Output: 12
Explanation: The circular subarray [3, 4, 5] gives the maximum sum of 12.
```

 **Constraints:** 
1 ≤ arr.size() ≤ 105
-104 ≤ arr[i] ≤ 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-22T16:24:27.372Z  

```java
class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
     int totalSum = 0;

        int currentMax = arr[0];
        int maxSum = arr[0];

        int currentMin = arr[0];
        int minSum = arr[0];

        for (int i = 0; i < arr.length; i++) {

            totalSum += arr[i];

            // Maximum normal subarray
            if (i > 0) {
                currentMax = Math.max(arr[i], currentMax + arr[i]);
                maxSum = Math.max(maxSum, currentMax);

                // Minimum subarray
                currentMin = Math.min(arr[i], currentMin + arr[i]);
                minSum = Math.min(minSum, currentMin);
            }
        }

        // If all elements are negative
        if (maxSum < 0) {
            return maxSum;
        }

        // Maximum circular sum
        int circularSum = totalSum - minSum;

        return Math.max(maxSum, circularSum);        
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/max-circular-subarray-sum-1587115620/1)