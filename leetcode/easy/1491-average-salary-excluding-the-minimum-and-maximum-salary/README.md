# Average Salary Excluding the Minimum and Maximum Salary

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an array of  **unique**  integers `salary` where `salary[i]` is the salary of the `ith` employee.

Return  *the average salary of employees excluding the minimum and maximum salary*. Answers within `10-5` of the actual answer will be accepted.

 

 **Example 1:** 

```
Input: salary = [4000,3000,1000,2000]
Output: 2500.00000
Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500

```

 **Example 2:** 

```
Input: salary = [1000,2000,3000]
Output: 2000.00000
Explanation: Minimum salary and maximum salary are 1000 and 3000 respectively.
Average salary excluding minimum and maximum salary is (2000) / 1 = 2000

```

 

 **Constraints:** 

- 3 <= salary.length <= 100
- 1000 <= salary[i] <= 106
- All the integers of salary are unique.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 45.8 MB (beats 24.16%)  
**Submitted:** 2026-08-29T18:28:00.778Z  

```java
class Solution { 
    public double average(int[] salary) { 
        int max = salary[0]; 
        int min = salary[0]; 
        double totalSum = 0; 

        // Find min, max, and total sum in a single pass
        for (int i = 0; i < salary.length; i++) { 
            if (salary[i] > max) { 
                max = salary[i]; 
            } 
            if (salary[i] < min) { 
                min = salary[i]; 
            } 
            totalSum += salary[i];
        } 

        // Subtract min and max from the total sum
        double targetSum = totalSum - min - max; 
        
        // Divide by total elements minus the 2 removed elements
        return targetSum / (salary.length - 2); 
    } 
}

```

---

[View on LeetCode](https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/)