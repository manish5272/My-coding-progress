# Find Digits

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

The *factorial* of the integer $n$, written $n!$, is defined as:   

$$n! = n \times (n-1) \times (n-2) \times \cdots \times 3 \times 2 \times 1$$

Calculate and print the factorial of a given integer.  

For example, if $n = 30$, we calculate $30 \times 29 \times 28 \times \cdots \times 2 \times 1$ and get $265252859812191058636308480000000$.

**Function Description**

Complete the *extraLongFactorials* function in the editor below.  It should print the result and return.  

extraLongFactorials has the following parameter(s):  

- *n*: an integer

**Note:** Factorials of $n > 20$ can't be stored even in a $64-bit$ long long variable. Big integers must be used for such calculations. Languages like Java, Python, Ruby etc. can handle big integers, but we need to write additional code in C/C++ to handle huge values.  

We recommend solving this challenge using BigIntegers.  

**Input Format**

 Input consists of a single integer $n$

**Constraints**

$1 \le n \le 100$

**Output Format**

Print the factorial of $n$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-20T20:28:01.630Z  

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
     * Complete the 'findDigits' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int findDigits(int n) {
    // Write your code here
        int number = n;
        int count=0;
        while(number>0){
            int last = number % 10;
            if((last != 0) && (n % last == 0)){
                count++;
            }
            number=number/10;
        }
        return count;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                int result = Result.findDigits(n);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/extra-long-factorials/problem)