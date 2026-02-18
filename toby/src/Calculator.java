import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Calculator {

    public Integer fileReadTemplate(String filePath, BufferedReaderCallback callback)
        throws IOException {

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(filePath));
            int res = callback.doSomethingWithReader(br);
            return res;
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

    public Integer calcSum(String filePath) throws IOException {
        BufferedReaderCallback sumCallBack =
            br -> {
                int sum = 0;
                String line = null;
                while ((line = br.readLine()) != null) {
                    sum += Integer.parseInt(line);
                }
                return sum;
            };

        return fileReadTemplate(filePath, sumCallBack);
    }

    public Integer calcMultiple(String filePath) throws IOException {
        BufferedReaderCallback sumCallBack =
            br -> {
                int multiply = 1;
                String line = null;
                while ((line = br.readLine()) != null) {
                    multiply *= Integer.parseInt(line);
                }
                return multiply;
            };

        return fileReadTemplate(filePath, sumCallBack);
    }
}
