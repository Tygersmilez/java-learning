import java.util.Scanner;
public class Double {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double firstNumber;
        double secondNumber;
        double division;

        System.out.println("Enter first number: ");
        firstNumber = sc.nextDouble();

        System.out.println("Enter second number: ");
        secondNumber = sc.nextDouble();

        division = firstNumber / secondNumber;
        System.out.println("The division is: " + division);
    }
}
