package Basic_Java_Coding.String_Programs;

import java.util.HashSet;

public class remove_duplicates{
    public static void main(String args[]){
        String s="programming";
        StringBuilder sb= new StringBuilder();

        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(!set.contains(ch)){
                set.add(ch);
                sb.append(ch);
            }
            
            
        }
        System.out.print(sb.toString());

    }
}