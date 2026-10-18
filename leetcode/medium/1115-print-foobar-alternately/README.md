# Print FooBar Alternately

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Suppose you are given the following code:

```
class FooBar {
  public void foo() {
    for (int i = 0; i < n; i++) {
      print("foo");
    }
  }

  public void bar() {
    for (int i = 0; i < n; i++) {
      print("bar");
    }
  }
}

```

The same instance of `FooBar` will be passed to two different threads:

- thread A will call foo(), while
- thread B will call bar().

Modify the given program to output `"foobar"` `n` times.

 

 **Example 1:** 

```
Input: n = 1
Output: "foobar"
Explanation: There are two threads being fired asynchronously. One of them calls foo(), while the other calls bar().
"foobar" is being output 1 time.

```

 **Example 2:** 

```
Input: n = 2
Output: "foobarfoobar"
Explanation: "foobar" is being output 2 times.

```

 

 **Constraints:** 

- 1 <= n <= 1000

## Solution

**Language:** Java  
**Runtime:** 23 ms (beats 17.21%)  
**Memory:** 45.8 MB (beats 35.95%)  
**Submitted:** 2026-08-30T17:41:12.225Z  

```java

import java.util.concurrent.Semaphore;

class FooBar {
    private int n;
    private Semaphore fooSemaphore = new Semaphore(1);
    private Semaphore barSemaphore = new Semaphore(0);

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            fooSemaphore.acquire();

            // printFoo.run() outputs "foo"
            printFoo.run();

            barSemaphore.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            barSemaphore.acquire();

            // printBar.run() outputs "bar"
            printBar.run();

            fooSemaphore.release();
        }
    }
}


```

---

[View on LeetCode](https://leetcode.com/problems/print-foobar-alternately/)