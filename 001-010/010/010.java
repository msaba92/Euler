import java.util.ArrayList;
import java.lang.Math;

class Main {
    private static int isPrime(int i, ArrayList<Integer> primes) {
        for (int x = 0; x < primes.size(); x++) {
            if (Math.sqrt(i) >= primes.get(x)) {
                if (i % primes.get(x) == 0) {
                    return 1;
                }
            } else {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        long total = 2;
        ArrayList<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        for (int i = 3; i < 2000000; i += 2) {
            if (isPrime(i, primes) == 0) {
                primes.add(i);
                total += i;
            }
        }
        System.out.println(total);
    }
}
