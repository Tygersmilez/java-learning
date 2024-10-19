import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int sum;
        int multiplier;
        int subtraction;
        int division;

        System.out.println("Enter first number: ");
        firstNumber = input.nextInt();

        System.out.println("Enter second number: ");
        secondNumber = input.nextInt();

        sum = firstNumber + secondNumber;
        System.out.println("The sum is: " + sum);

        multiplier = firstNumber * secondNumber;
        System.out.println("The multiplier is: " + multiplier);

        subtraction = firstNumber - secondNumber;
        System.out.println("The subtraction is: " + subtraction);

        division = firstNumber / secondNumber;
        System.out.println("The division is: " + division);
    }
}