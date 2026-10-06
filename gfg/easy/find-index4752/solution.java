class Solution {
    public ArrayList<Integer> findIndex(int[] arr, int key) {
        
        ArrayList<Integer> list = new ArrayList<>(2);
        
        int target = key;
        int first = -1;
        int last =-1;
        
        
        for(int i=0;i<arr.length;i++){
            
            if(arr[i] == target){
                
                first=i;
                break;
            }
        }
        list.add(first);
        for(int j=arr.length-1;j>=0;j--){
            if(arr[j] == target){
                last=j;
                break;
            }
            
        }
        list.add(last);
        
        return list;
        
        
    }
};