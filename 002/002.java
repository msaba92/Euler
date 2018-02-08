// By considering the terms in the Fibonacci sequence whose values
// do not exceed four million, find the sum of the even-valued terms.

class main {
    public static void main(String[] args) {
        int i = 1;
        int j, total = 0;
        for (int k = 0; k < 4000000; k = i+j) {
            j = i;
            i = k;
            if (k % 2 == 0) {
                total += k;
            }
        }
        System.out.println(total);
    }
}
