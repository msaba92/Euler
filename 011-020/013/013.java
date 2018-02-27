import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;

class Main {

    public static double processer() throws Exception {
        FileInputStream fstream = new FileInputStream("numbers");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        String line;

        double total = 0;

        while ((line = br.readLine()) != null) {
            total += Double.parseDouble(line);
        }

        br.close();

        return total;
    }


    public static void main(String[] args) throws Exception {
        double total = processer();
        System.out.printf("%s\n", BigDecimal.valueOf(total).toPlainString().substring(0, 10));
    }
}
