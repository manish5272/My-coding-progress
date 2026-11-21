class Solution {
    public int getLeastFrequentDigit(int n) {
        String s = String.valueOf(n);
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        int minFreq = Integer.MAX_VALUE;
        char ans = arr[0];
        int count = 1;

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] == arr[j - 1]) {
                count++;
            } else {
                if (count < minFreq) {
                    minFreq = count;
                    ans = arr[j - 1];
                }
                count = 1;
            }
        }

        // Check the final group of digits at the end of the array
        if (count < minFreq) {
            ans = arr[arr.length - 1];
        }

        return ans - '0';
    }
}