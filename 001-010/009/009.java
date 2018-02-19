import java.lang.Math;

class Main {
    public static void main(String[] args) {
        for (int a = 2; a < 1001; a++) {
            for (int b = 3; b < 1001; b++) {
                for (int c = 4; c < 1001; c++) {
                    if (a + b + c == 1000) {
                        if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                            System.out.printf("%d, %d, %d, %d\n", a, b, c, a * b * c);
                            return;
                        }
                    } else if (a + b + c > 1000) {
                        break;
                    }
                }
            }
        }
    }
}
