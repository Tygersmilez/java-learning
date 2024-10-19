import java.util.Scanner;

public class WorldPopulation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter World Population Size: ");
        double currentPopulation = input.nextDouble();

        System.out.println("Enter World Population Growth Rate (as a percentage): ");
        double growthRate = input.nextDouble();

        growthRate = growthRate / 100;

        for (int year = 1; year <= 5; year++) {
            currentPopulation += currentPopulation * growthRate;
            System.out.printf("Estimated world population after year %d: %.0f%n", year, currentPopulation);
        }

    }
}
