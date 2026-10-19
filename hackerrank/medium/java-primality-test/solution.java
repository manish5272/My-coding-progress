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



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        
        

        bufferedReader.close();
        int v = Integer.parseInt(n);
        
        if(isProbablePrime(v)){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
        
        
        
    }
    
    public static boolean isProbablePrime(int n){
        
        int count=0;
        boolean isPrime=true;
        
        if(n>1){
            
            for(int i=1;i<=n;i++){
                if(n % i == 0){
                    count++;
                }
            }
            
            if(count == 2){
                isPrime=true;
            }
            else{
                isPrime=false;
            }
            
        }
        else{
            isPrime=false;
        }
        return isPrime;
        
        
        
    }
}
