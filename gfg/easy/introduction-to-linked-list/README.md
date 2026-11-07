# Array to Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an array  **arr[]** of integers. You have to construct a singly linked list from the elements of the arr[] and return the head of the linked list.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4, 5]
Output: 1 -> 2 -> 3 -> 4 -> 5 
Explanation: Linked list for the given array will be,
      
```

```
Input: arr[] = [10, 11, 12, 13, 14]
Output: 10 -> 11 -> 12 -> 13 -> 14
Explanation: Linked list for the given array will be,
     
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-07T14:34:15.904Z  

```java
/* Linked List Node Structure
class Node {
    int data;
    Node next;
    Node (int d) {
       data = d;
       next = null;
    }
};
*/
class Solution {
    public Node arrayToList(int arr[]) {
        
        if(arr.length <= 0){
            return null;
        }
        
        Node head = new Node(arr[0]);
        Node current = head;
        
        for(int i=1;i<arr.length;i++){
            Node newNode = new Node(arr[i]);
            
            current.next=newNode;
            
            current = newNode;
            
        }
        
        return head;
        
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/introduction-to-linked-list/1)