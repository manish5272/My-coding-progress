package Basic_Java_Coding.Integer_Frequency_without_Hashmap;

public class Find_Elements_Appearing_Only_Once {
    public static void main(String args[]){

        int[] arr = {10, 10, 20, 20};
        boolean[] visited = new boolean[arr.length];
        
        for(int i=0;i<arr.length;i++){
            if(visited[i] == true){
                continue;
            }
            int count = 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                    visited[j] = true;

                }
            }

            if(count == 1){
                System.out.print(arr[i]+" ");
            }
        }

    }
}
