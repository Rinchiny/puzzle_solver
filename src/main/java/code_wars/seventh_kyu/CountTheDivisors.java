package code_wars.seventh_kyu;

public class CountTheDivisors {

    public long countNumberOfDivisors(int n) {
        long result = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                // If divisors are equal,
                // count only one
                if (n / i == i)
                    result++;

                else // Otherwise, count both
                    result = result + 2;
            }
        }
        return result;
    }
}
