import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Vector;

class Main {

    public static long processer() throws Exception {
        File file = new File("grid");
        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);
        String line;

        long target = 0;
        Vector<Vector<String>> grid = new Vector<Vector<String>>();

        while ((line = br.readLine()) != null) {

            Vector<String> final_line = new Vector<String>();
            String[] convertedline = line.split(" ");

            for (String s : convertedline) {
                final_line.add(s);
            }

            grid.add(final_line);

            }

        for (int row = 0; row < grid.size(); row++) {
            for (int column = 0; column < grid.get(row).size(); column++) {
                long number = Long.parseLong(grid.get(row).get(column));
                Vector<Long> total = new Vector<Long>();

                for (int x = 0; x < 4; x++) {
                    total.add(number);
                }
                // I could optimize this by making it avoid the lines containing 0,
                // but I feel like it's already fast enough and there's really no need to
                for (int y = 1; y < 4; y++) {
                    try {
                        total.set(0, total.get(0) * Long.parseLong(grid.get(row + y).get(column)));
                    } catch (ArrayIndexOutOfBoundsException exception) {
                        total.set(0, 1L);
                    }
                    try {
                        total.set(1, total.get(1) * Long.parseLong(grid.get(row).get(column + y)));
                    } catch (ArrayIndexOutOfBoundsException exception) {
                        total.set(1, 1L);
                    }
                    try {
                        total.set(2, total.get(2) * Long.parseLong(grid.get(row + y).get(column + y)));
                    } catch (ArrayIndexOutOfBoundsException exception) {
                        total.set(2, 1L);
                    }
                    try {
                        total.set(3, total.get(3) * Long.parseLong(grid.get(row - y).get(column + y)));
                    } catch (ArrayIndexOutOfBoundsException exception) {
                        total.set(3, 1L);
                    }
                }
                for (int z = 0; z < total.size(); z++) {
                    if (total.get(z) > target) {
                        target = total.get(z);
                    }
                }
            }
        }
        return target;
    }

    public static void main(String[] args) throws Exception {
        long target = processer();
        System.out.println(target);
    }
}
