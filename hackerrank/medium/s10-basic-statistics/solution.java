import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        // Mean
        double mean = (double) sum / n;
        System.out.printf("%.1f%n", mean);

        // Sort for median
        Arrays.sort(arr);

        // Median
        double median;

        if (n % 2 != 0) {
            median = arr[n / 2];
        } else {
            median = (arr[n / 2] + arr[n / 2 - 1]) / 2.0;
        }

        System.out.printf("%.1f%n", median);

        // Mode
        int mode = arr[0];
        int maxCount = 1;
        int count = 1;

        for (int i = 1; i < n; i++) {

            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count > maxCount) {
                maxCount = count;
                mode = arr[i];
            }
        }

        System.out.println(mode);
    }
}
