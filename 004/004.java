// Find the largest palindrome made from the product of two 3-digit numbers.

class Main {
    public static boolean isPalindrome(int k) {
        String r = String.valueOf(k);
        for (int s = 0; s < r.length() / 2; s++) {
            if (r.charAt(s) != r.charAt(r.length() - (1 + s))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int control = 0;
        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                int  k = i * j;
                if (isPalindrome(k) == true) {
                    if (k > control) {
                        control = k;
                    }
                }
            }
        }
        System.out.printf("The largest palindrome in question is %d.\n", control);
    }
}
