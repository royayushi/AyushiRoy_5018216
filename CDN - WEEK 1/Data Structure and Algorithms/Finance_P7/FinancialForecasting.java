package Finance_P7;
import java.util.Scanner;

public class FinancialForecasting {
//	Using formula: Future Value = Present Value * (1 + Growth Rate) ^ Number of Periods.
	
	// Method to calculate future value using recursion
    public static double calculateFutureValue(double presentValue, double growthRate, int periods) {
        // Base case: If no more periods, return the present value
        if (periods == 0) {
            return presentValue;
        }

        // Recursive case: Calculating the value for the next period
        return calculateFutureValue(presentValue * (1 + growthRate), growthRate, periods - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Present Value: ");
        double presentValue = scanner.nextDouble();

        System.out.print("Enter Growth Rate (as a decimal, e.g., 0.05 for 5%): ");
        double growthRate = scanner.nextDouble();

        System.out.print("Enter Number of Periods: ");
        int periods = scanner.nextInt();

        double futureValue = calculateFutureValue(presentValue, growthRate, periods);
        System.out.println("Future Value: " + futureValue);
        
        scanner.close();
    }
    
}

/*

Output:

Enter Present Value: 60000
Enter Growth Rate (as a decimal, e.g., 0.05 for 5%): 0.07
Enter Number of Periods: 5
Future Value: 84153.10384200003

*/
