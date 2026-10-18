class Solution {
    ArrayList<Integer> fibonacciNumbers(int n) {

        ArrayList<Integer> list = new ArrayList<>();

        int mod = 1000000007;

        int first = 0;
        int second = 1;

        list.add(first);

        if (n >= 1) {
            list.add(second);
        }

        for (int i = 2; i <= n; i++) {

            int third = (first + second) % mod;

            list.add(third);

            first = second;
            second = third;
        }

        return list;
    }
}