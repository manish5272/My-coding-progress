# Day 0: Mean, Median, and Mode

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

**Objective**	
In this challenge, we practice calculating the *mean*, *median*, and *mode*. Check out the [Tutorial](/challenges/s10-basic-statistics/tutorial) tab for learning materials and an instructional video!

**Task**	
Given an array, $X$, of $N$ integers, calculate and print the respective *mean*, *median*, and *mode* on separate lines. If your array contains more than one *modal value*, choose the numerically smallest one.

**Note:** Other than the modal value (which will always be an integer), your answers should be in decimal form, rounded to a scale of $1$ decimal place (i.e., $12.3$, $7.0$ format).  

**Example**  
$N = 6$  
$X = [1, 2, 3, 4, 5, 5]$  

The mean is $\frac{20}{6} = 3.3$.  
The median is $\frac{3+4}{2} = 3.5$.    
The mode is $5$ because $5$ occurs most frequently.  

**Input Format**

The first line contains an integer, $N$, the number of elements in the array. 	
The second line contains $N$ space-separated integers that describe the array's elements.

**Constraints**

- $10 \le N \le 2500$  
- $0 \lt x[i]  \le 10^5$, where $x[i]$ is the $i^{th}$ element of the array.

**Output Format**

Print $3$ lines of output in the following order:

1. Print the *mean* on the first line to a scale of $1$ decimal place (i.e., $12.3$, $7.0$).
2. Print the *median* on a new line, to a scale of $1$ decimal place (i.e., $12.3$, $7.0$).
3. Print the *mode* on a new line. If more than one such value exists, print the numerically smallest one.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T20:16:19.605Z  

```java
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        // Mean
        double mean = (double) sum / n;
        System.out.printf("%.1f%n", mean);

        // Sort for median
        Arrays.sort(arr);

        // Median
        double median;

        if (n % 2 != 0) {
            median = arr[n / 2];
        } else {
            median = (arr[n / 2] + arr[n / 2 - 1]) / 2.0;
        }

        System.out.printf("%.1f%n", median);

        // Mode
        int mode = arr[0];
        int maxCount = 1;
        int count = 1;

        for (int i = 1; i < n; i++) {

            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count > maxCount) {
                maxCount = count;
                mode = arr[i];
            }
        }

        System.out.println(mode);
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/s10-basic-statistics/problem)