import java.io.IOException;

public class CalcMultiplyTest {

    public static void main(String[] args) throws IOException {

        Calculator calculator = new Calculator();

        int result = calculator.calcMultiple(
            CalcMultiplyTest.class.getResource("numbers.txt").getPath());

        if (result == 24) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
}
