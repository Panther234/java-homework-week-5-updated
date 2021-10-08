import java.util.Scanner;

// A java programme to Input and Display Answer

public class InputMultiplier {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = in.nextInt(); // Test value for first input = 25
        System.out.print("Input second number: ");
        int b = in.nextInt(); // Test value for second input = 5
        System.out.print("Product of two inputs is: ");
        System.out.print(a*b);
    }
}
