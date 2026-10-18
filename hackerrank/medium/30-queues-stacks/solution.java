import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        
        int i = 0;
        int j = word.length() - 1;
        boolean isPalindrome = true;
        
        while (i < j) {
            if (word.charAt(i) == word.charAt(j)) {
                i++;
                j--;
            }
            else {
                isPalindrome = false;
                break;
            }
        }
        
        // Fixed the print statement logic here
        if (!isPalindrome) {
            System.out.println("The word, " + word + ", is not a palindrome.");
        }
        else {
            System.out.println("The word, " + word + ", is a palindrome.");      
        }
        
        sc.close(); // Good practice to close the scanner
    }
}
