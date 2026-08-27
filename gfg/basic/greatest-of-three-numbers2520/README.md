# Greatest of three numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given three numbers a, b and c. Find the greatest number among them.

 **Examples:** 

```
Input: a = 10, b = 3, c = 2
Output: 10
Explanation: 10 is greatest among the three 
```

```
Input: a = -4, b = -3, c = -2
Output: -2
Explanation: -2 is greatest among the three
```

 **Constraints:** 
-109≤ a, b, c ≤109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-27T00:43:54.957Z  

```java
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // code here
        if( a > b && a > c){
            System.out.print(a);
        }
        
        else if(b>a && b > c){
            System.out.print(b);
        }
        
        else{
            System.out.print(c);
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/greatest-of-three-numbers2520/1)