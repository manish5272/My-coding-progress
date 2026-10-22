class Solution {
    void pushZerosToEnd(int[] arr) {
        
        int z =0;
        for(int i=1;i<=arr.length-1;i++){
            
            if(arr[z] == 0 && arr[i] != 0){
                arr[z]=arr[i];
                arr[i]=0;
                z++;
                
            }
            else if(arr[z] != 0){
                z++;
                
            }
            
        }
        
    }
}