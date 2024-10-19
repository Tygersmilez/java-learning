import java.util.Scanner;

public class WeightCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();

        System.out.println("Enter height in inches: ");
        double heightInInches = input.nextDouble();

        double bmi = (weightInPounds * 703) / (heightInInches * heightInInches);
        System.out.printf("Your BMI is: %.2f%n", bmi);

        System.out.println("BMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal: between 18.5 and 24.9");
        System.out.println("Overweight: between 25 and 29.9");
        System.out.println("Obese: 30 or greater");

        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("You are in the normal weight range.");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
    }
}
