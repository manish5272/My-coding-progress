# Java Primality Test

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

A prime number is a natural number greater than $1$ whose only positive divisors are $1$ and itself. For example, the first six prime numbers are $2$, $3$, $5$, $7$, $11$, and $13$.

Given a large integer, $n$, use the Java *BigInteger* class' [*isProbablePrime*](https://docs.oracle.com/javase/7/docs/api/java/math/BigInteger.html#isProbablePrime%28int%29) method to determine and print whether it's ``prime`` or  ``not prime``.

**Input Format**

A single line containing an integer, $n$ (the number to be checked).

**Constraints**

* $n$ contains at most $100$ digits.

**Constraints**

 

**Output Format**

If $n$ is a prime number, print ``prime``; otherwise, print ``not prime``.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-19T18:27:32.085Z  

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



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        
        

        bufferedReader.close();
        int v = Integer.parseInt(n);
        
        if(isProbablePrime(v)){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
        
        
        
    }
    
    public static boolean isProbablePrime(int n){
        
        int count=0;
        boolean isPrime=true;
        
        if(n>1){
            
            for(int i=1;i<=n;i++){
                if(n % i == 0){
                    count++;
                }
            }
            
            if(count == 2){
                isPrime=true;
            }
            else{
                isPrime=false;
            }
            
        }
        else{
            isPrime=false;
        }
        return isPrime;
        
        
        
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-primality-test/problem)