// Find the difference between the sum of the squares of the
// first one hundred natural numbers and the square of the sum.


class Main {
    private static int difference() {
        int tsum = 0;
        int tdiff = 0;

        for (int x = 1; x <= 100; x++) {
            tsum += (int)Math.pow(x, 2);
            tdiff += x;
        }

        return tsum - (int)Math.pow(tdiff, 2);
    }

    public static void main(String[] args) {
        int number = difference();
        System.out.printf("The number in question is %d.\n", number);
    }
}
