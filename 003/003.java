// What is the largest prime factor of the number 600851475143?

class main {
    public static int isPrime(double k) {
        for (int j = 2; j < k / 2; j++)
            if (k % j == 0) {
                return 0;
            }
        return 1;

    };

    public static void main(String[] args) {
        double target = 600851475143L;
        for (int i = 2; i <= target / 2; i++) {
            double k = target / i;
            if (k % 1 == 0) {
                if (isPrime(k) == 1) {
                    System.out.printf("The highest prime factorial is %d.\n", (int)k);
                    break;
                }
            }
        }
    }
}
