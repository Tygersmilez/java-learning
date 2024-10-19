import java.util.Scanner;
public class MultipleChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber;
        int secondNumber;

        System.out.println("Enter first number: ");
        firstNumber = input.nextInt();

        System.out.println("Enter second number: ");
        secondNumber = input.nextInt();

if (secondNumber != 0 && firstNumber % secondNumber == 0) {
    System.out.println("first number is a multiple of second number");
}
    if (secondNumber == 0) {
        System.out.println("Number cannot be divisible by zero");
    }
}
    }

