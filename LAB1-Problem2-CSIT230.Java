import java.util.Scanner;

public class StockTrading {

    // Method to calculate maximum profit
    public static int maxProfit(int[] prices) {
        int profit = 0;

        // Go through each day and take all positive gains
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice;

        do {
            // Enter number of days
            System.out.print("Enter the number of days: ");
            int days = input.nextInt();

            // Validation: at least 1 day
            while (days < 1) {
                System.out.println("Invalid input. Number of days must be >= 1.");
                System.out.print("Re-enter the number of days: ");
                days = input.nextInt();
            }

            int[] prices = new int[days];

            // Enter stock prices
            int[] price = new int[days];
            System.out.println("Enter the stock prices for each day:");
            for (int i = 0; i < days; i++) {
                prices[i] = input.nextInt();

                while (prices[i] <= 0) {
                    System.out.println("Invalid value. Price must be >= 0.");
                    System.out.println("Re-Enter value of the price:");
                    prices[i] = input.nextInt();
                }
            }

            // Calculate max profit
            int result = maxProfit(prices);

            // Output
            System.out.println("Maximum Profit: " + result);

            // Run again?
            System.out.print("Do you want to run again? (y/days): ");
            choice = input.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program ended. Goodbye!");
        input.close();
    }
}
