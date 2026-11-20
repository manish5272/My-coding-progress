package Basic_Java_Coding.String_Programs;

public class Check_Whether_a_String_Contains_Only_Digits {
    public static void main(String args[]) {
        String s = "";
        boolean res = isDigit(s);
        System.out.println(res);
    }

    public static boolean isDigit(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }
}
