import java.io.IOException;

public class CalcSumTest {

    public static void main(String[] args) throws IOException {

        Calculator calculator = new Calculator();

        int sum = calculator.calcSum(CalcSumTest.class.getResource("numbers.txt").getPath());

        System.out.println(sum);

        assert sum == 10;
    }
}
