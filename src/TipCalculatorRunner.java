import java.util.Scanner;

public class TipCalculatorRunner {
    public static void main (String[] args){
        double foodCost = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator! ");
        System.out.print("How many people are in your group? ");
        int numPeople = scan.nextInt();
        scan.nextLine();

        System.out.print("What's the tip percentage? (0 - 100): ");
        int tipPercentage = scan.nextInt();
        scan.nextLine();

        TipCalculator calc = new TipCalculator(numPeople, tipPercentage);

        while (foodCost != -1) {
                System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
                foodCost = scan.nextDouble();
                scan.nextLine();
            if (foodCost != -1) {
                calc.addMeal(foodCost);
            }
        }

        System.out.println("--------------------------");
        System.out.println("Total Bill Before Tip: " + calc.getTotalBillBeforeTip());
        System.out.println("Tip Percentage: " + calc.getTipPercentage());
        System.out.println("Total Tip: " + calc.tipAmount());
        System.out.println("Total Bill With Tip: " + calc.totalBill());
        System.out.println("Per Person Cost Before Tip: " + calc.perPersonCostBeforeTip());
        System.out.println("Tip Per Person: " + calc.perPersonTipAmount());
        System.out.println("Total Cost Per Person: " + calc.perPersonTotalCost());
    }
}
