class Solution {
    void segregateEvenOdd(int arr[]) {
        
        
        ArrayList<Integer> evenlist = new ArrayList<>();
        ArrayList<Integer> oddlist = new ArrayList<>();
        
        for(int i = 0  ;i < arr.length ;i++){
            
            if(arr[i] % 2 == 0){
                evenlist.add(arr[i]);
                
            }
            else{
                oddlist.add(arr[i]);
            }
        }
        
        Collections.sort(evenlist);
        Collections.sort(oddlist);
        
        int index=0;
        
        for(int i=0;i<evenlist.size();i++){
            arr[index] =  evenlist.get(i);
            index++;
        }
        
        for(int i=0;i<oddlist.size();i++){
            arr[index]= oddlist.get(i);
            index++;
        }
        
        
        

    }
    
    
}