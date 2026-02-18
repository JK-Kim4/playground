import java.io.BufferedReader;import java.io.FileNotFoundException;import java.io.FileReader;import java.io.IOException;public class Calculator {

    public Integer calcSum(String filePath) throws IOException {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(filePath));
            String line;
            Integer sum = 0;
            while ((line = br.readLine()) != null) {
                sum += Integer.valueOf(line);
            }

            return sum;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw e;
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
