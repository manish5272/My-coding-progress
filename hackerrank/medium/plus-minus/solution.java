import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        
        float positive_count = 0;
        float negative_count = 0;
        float zero_count = 0;
        
        
        for(int i = 0 ; i<arr.size();i++){
            
            int current = arr.get(i);
            
            
            if(current > 0){
                positive_count++;
            }
            else if(current < 0){
                negative_count++;
            }
            else{
                zero_count++;
            }
        }
        
        System.out.printf("%.6f\n",positive_count/arr.size());
        System.out.printf("%.6f\n",negative_count/arr.size());
        System.out.printf("%.6f\n",zero_count/arr.size());

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
