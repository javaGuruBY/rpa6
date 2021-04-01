package lecture2;
import java.io.IOException;
import java.util.Scanner;

public class MathOerationsTest {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first value and press Enter");
        int a = scanner.nextInt();
        System.out.println("Input the action (+ - * or /) and press Enter");
        int x = System.in.read();
        char b = (char) x;
        System.out.println("Input the second value and press Enter");
        int c = scanner.nextInt();
        MathOperations mathOperations = new MathOperations(a, b, c);
        System.out.println("Result = " + mathOperations.operations());
    }
}
