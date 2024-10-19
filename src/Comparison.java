import java.util.Scanner;
public class Comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNumber; //input first number to compare
        int secondNumber;

        System.out.println("Enter first number: ");
        firstNumber = sc.nextInt();

        System.out.println("Enter second number: ");
        secondNumber = sc.nextInt();

        if (firstNumber == secondNumber)
            System.out.println("These numbers are equal");

        if (firstNumber > secondNumber)
            System.out.println(firstNumber + " " + "is larger");
    }
}
