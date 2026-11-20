package Basic_Java_Coding.Integer_Frequency_without_Hashmap;


import java.util.Arrays;

public class Find_frequency_of_every_integer {
    public static void main(String args[]){
        int[] arr = {1,1,2,3,4,1,1,9,7,0,1};

        Arrays.sort(arr);
        int count =1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] == arr[i-1]){
                count++;
            }
            else{
                System.out.println(arr[i-1]+"-->"+count);
                count=1;
            }
        }
        System.out.print(arr[arr.length-1 ]+"-->"+count);
    }
    
}
