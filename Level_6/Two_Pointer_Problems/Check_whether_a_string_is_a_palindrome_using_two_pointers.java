import java.util.*;




public class Check_whether_a_string_is_a_palindrome_using_two_pointers {
 public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        sc.close();
        
        
        
        int i=0;
        int j=word.length() -1;
        boolean isPalindrome=true;
        
        while(i<j){
            if(word.charAt(i) == word.charAt(j)){
                i++;
                j--;
                
                
            }
            else{
                
                isPalindrome=false;
                break;
            }
        }
        
        if(!isPalindrome){
            System.out.println("The word, "+word+", is not a palindrome.");
        }
        
        else{
        System.out.println("The word, "+word+", is a palindrome.");      
  }
        
        
        
    }
}