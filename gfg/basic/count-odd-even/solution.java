class Solution {
    public int[] countOddEven(int[] arr) {
        
        int even_count = 0;
        int odd_count = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] % 2 == 0 ){
                even_count++;
            }
            else{
                odd_count++;
            }
        }
        
        return new int[] { odd_count, even_count };
        
    }
}