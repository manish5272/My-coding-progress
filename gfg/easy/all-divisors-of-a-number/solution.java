class Solution {
    public ArrayList<Integer> getDivisors(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
                if (i != n / i) {
                    list.add(n / i); // Add the paired divisor if it's distinct
                }
            }
        }

        // Sort if the platform expects divisors in ascending order
        Collections.sort(list); 
        return list;
    }
}