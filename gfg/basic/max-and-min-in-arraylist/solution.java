//SUBMISSION 2 WITHOUT USING BUILT IN METHODS , AND NORMAL FOR LOOPS

class Solution {
    public static int maximumElement(ArrayList<Integer> arr) {
        
        int max=arr.get(0);
        for(int i=0;i<arr.size();i++){
            int current = arr.get(i);
            if(current > max){
                max = arr.get(i);
            }
        }
        
        return max;
        
    }

    public static int minimumElement(ArrayList<Integer> arr) {
        
        int min=arr.get(1);
        
        for(int i=0;i<arr.size();i++){
            int current = arr.get(i);
            if(current < min){
                min = arr.get(i);
            }
        }
        
        return min;
    }
}
