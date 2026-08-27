import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res1 = n*(n+1);
        int res2 = res1/2;
        
        System.out.println(res2);
    }
}