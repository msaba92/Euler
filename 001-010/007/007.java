import java.util.ArrayList;

// What is the 10 001st prime number?

class Main {
    private static int findprime() {

        int i = 3;
        boolean prime = false;

        ArrayList<Integer> knownprimes = new ArrayList<Integer>();
        knownprimes.add(2);

        while (knownprimes.size() < 10001) {
            for (int x = 0; x < knownprimes.size(); x++) {
                if (i % knownprimes.get(x) == 0) {
                    prime = false;
                    break;
                } else {
                    prime = true;
                }
            }
            if (prime) {
                knownprimes.add(i);
            }
            i += 1;
        }
        return knownprimes.get(knownprimes.size() - 1);
    }

    public static void main(String[] args) {
        int number = findprime();
        System.out.printf("The number in question is %d\n", number);
    }
}
