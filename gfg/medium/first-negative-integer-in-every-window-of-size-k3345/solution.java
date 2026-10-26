class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        
        
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        
        // 1. Process the first window of size k
                for (int i = 0; i < k; i++) {
                    if (arr[i] < 0) {
                        q.offer(arr[i]); // Store negative numbers in the queue
                    }
                }
                
                
         
        if(q.isEmpty()){
            list.add(0);
        }
        else{
            list.add(q.peek());
        }
        
        
        
        for(int i=1;i<=arr.length-k;i++){
            //removing the element of arr[i-1]
            if(arr[i-1]<0){
                q.poll();
            }
            
            //adding the element of arr[i+k-1]
            int incomming = arr[i+k-1];
            
            if(incomming < 0){
                q.offer(incomming);
            }
            
            
            if(q.isEmpty()){
                list.add(0);
            }
            else{
                list.add(q.peek()); 
            }
            
        }
        return list;
        
        
    }
}