package Basic_Java_Coding.Star_Patterns;

public class Hallow_Pyramid_Pattern {
    public static void main(String args[]) {
        int n = 3;

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }

            // Print the hollow pattern characters for each row
            for (int j = 1; j <= (2 * i - 1); j++) {
                // Print a star at the first position, last position, or on the last row
                if (j == 1 || j == (2 * i - 1) || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}