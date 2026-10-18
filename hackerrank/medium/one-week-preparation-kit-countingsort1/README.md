# one-week-preparation-kit-countingsort1

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

**Comparison Sorting**  
Quicksort usually has a running time of $n \times log(n)$, but is there an algorithm that can sort even faster? In general, this is not possible. Most sorting algorithms are _comparison sorts_, i.e. they sort a list just by comparing the elements to one another. A comparison sort algorithm cannot beat $n \times log(n)$ (worst-case) running time, since $n \times log(n)$ represents the minimum number of comparisons needed to know where to place each element. For more details, you can see [these notes](http://www.cs.cmu.edu/~avrim/451f11/lectures/lect0913.pdf) (PDF). 

**Alternative Sorting**  
Another sorting method, the *counting sort*, does not require comparison.  Instead, you create an integer array whose index range covers the entire range of values in your array to sort.  Each time a value occurs in the original array, you increment the counter at that index.  At the end, run through your counting array, printing the value of each non-zero valued index that number of times.

**Example**   
$arr = [1, 1, 3, 2, 1]$    

All of the values are in the range $[0 \ldots 3]$, so create an array of zeros, $result = [0, 0, 0, 0]$.  The results of each iteration follow:

```
i	arr[i]	result
0	1	[0, 1, 0, 0]
1	1	[0, 2, 0, 0]
2	3	[0, 2, 0, 1]
3	2	[0, 2, 1, 1]
4	1	[0, 3, 1, 1]
```

The frequency array is $[0, 3, 1, 1]$. These values can be used to create the sorted array as well: $sorted = [1, 1, 1, 2, 3]$.

**Note**  
For this exercise, always return a frequency array with 100 elements.  The example above shows only the first 4 elements, the remainder being zeros.  

**Challenge**  
Given a list of integers, count and return the number of times each value appears as an array of integers.

**Function Description**  

Complete the *countingSort* function in the editor below.  

countingSort has the following parameter(s):  

- *arr[n]:* an array of integers  

**Returns**   

- *int[100]:* a frequency array

**Input Format**

The first line contains an integer $n$, the number of items in $arr$.   
Each of the next $n$ lines contains an integer $arr[i]$ where $0 \le i \lt n$.  

**Constraints**

$100 \le n \le 10$<sup>$6$</sup>     
$0 \le arr[i] \lt 100$ 


**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-12T15:59:45.085Z  

```java
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
    
        
        // 1. Create a frequency array of size 100 (values in Counting Sort 1 are 0 to 99)
        int[] frequency = new int[100];
        
        // 2. Count the occurrences of each number in the input list (O(N) time)
        for(int i = 0; i < arr.size(); i++) {
            int val = arr.get(i);
            frequency[val]++;
        }
        
        // 3. Convert the frequency array into a List<Integer> to match the return type
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < frequency.length; i++) {
            result.add(frequency[i]);
        }
        
        // 4. Return the result list
        return result;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.countingSort(arr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/one-week-preparation-kit-countingsort1/problem)