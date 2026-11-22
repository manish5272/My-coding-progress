class myQueue {
    
    int[] q;
    int front;
    int rear;
    int size;
    int capacity;

    // Constructor
    public myQueue(int n) {
        // Define Data Structures
    
        q = new int[n];
        capacity = n;
        front = 0;
        rear=-1;
        size=0;
    }

    public boolean isEmpty() {
        // Check if queue is empty
        return size == 0;
    }

    public boolean isFull() {
        // Check if queue is full
        return capacity == size;
    }

    public void enqueue(int x) {
        // Enqueue
        
        if(isFull()){
            return;
        }
        rear = (rear+1) % capacity;
        q[rear] = x;
        size++;
    }

    public void dequeue() {
        if(isEmpty()){
            return;
        }
        
        front = (front+1) % capacity;
        size--;
        // Dequeue
    }

    public int getFront() {
        // Get front element
        if(isEmpty()){
            return -1;
        }
        return q[front];
    }

    public int getRear() {
        if(isEmpty()){
            return -1;
        }
        return q[rear];
        // Get last element
    }
}
