import java.util.Scanner;
public class Average {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int sum;
        int product;
        int average;

        System.out.println("Enter first number: ");
        firstNumber = sc.nextInt();

        System.out.println("Enter second number: ");
        secondNumber = sc.nextInt();

        System.out.println("Enter third number: ");
        thirdNumber = sc.nextInt();


        sum = firstNumber + secondNumber + thirdNumber;
        System.out.println("The sum is: " + sum);

        product = firstNumber * secondNumber * thirdNumber;
        System.out.println("The multiplier is: " + product);

        average = sum / 3;
        System.out.println("The average is: " + average);
    }
}
