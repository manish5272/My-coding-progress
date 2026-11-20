package Basic_Java_Coding.String_Programs;

import java.util.HashMap;

public class find_character_frequency {
    public static void main(String args[]){
        
        String s = "abcddddcc";
        System.out.println(countFrequency(s));
    }

    public static HashMap<Character,Integer> countFrequency(String s){
        
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        return map;
    }


    
}
