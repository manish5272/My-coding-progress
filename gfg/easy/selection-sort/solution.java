class Solution {
    void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int smallestIndex = i;

            for (int j = i + 1; j < n; j++) {
                // FIXED: Use '<' to find the smallest element
                if (arr[j] < arr[smallestIndex]) {
                    smallestIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the pass
            int temp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
    }

    
}