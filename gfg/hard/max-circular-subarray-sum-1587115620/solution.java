class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
     int totalSum = 0;

        int currentMax = arr[0];
        int maxSum = arr[0];

        int currentMin = arr[0];
        int minSum = arr[0];

        for (int i = 0; i < arr.length; i++) {

            totalSum += arr[i];

            // Maximum normal subarray
            if (i > 0) {
                currentMax = Math.max(arr[i], currentMax + arr[i]);
                maxSum = Math.max(maxSum, currentMax);

                // Minimum subarray
                currentMin = Math.min(arr[i], currentMin + arr[i]);
                minSum = Math.min(minSum, currentMin);
            }
        }

        // If all elements are negative
        if (maxSum < 0) {
            return maxSum;
        }

        // Maximum circular sum
        int circularSum = totalSum - minSum;

        return Math.max(maxSum, circularSum);        
    }
}
