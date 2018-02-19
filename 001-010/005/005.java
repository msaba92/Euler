// Find the largest palindrome made from the product of two 3-digit numbers.

class Main {
    private static int finder() {
        int step = 20;
        boolean found = false;

        while (true) {
            for (int i = 11; i <= 20; i++) {
                if (step % i == 0) {
                    found = true;
                } else {
                    found = false;
                    break;
                }
            }
            if (found) {
                return step;
            }
            step = step + 20;
        }
    }

    public static void main(String[] args) {
        int number = finder();
        System.out.printf("The number in question is %d.\n", number);
    }
}
