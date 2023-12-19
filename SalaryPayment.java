import java.util.Scanner;

public class SalaryPayment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] totalSalaries = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("User " + (i + 1) + ":");
            System.out.println("What is your role (A/L): ");
            String userRole = input.next().toUpperCase();
            input.nextLine();

            System.out.println("How many hours have you worked: ");
            double hoursWorked = input.nextDouble();

            double baseSalary = 100.0;
            int baseHours = userRole.equals("A") ? 9 : 16;
            double overTime = hoursWorked - baseHours;
            double overtimeRate = (userRole.equals("A")) ? 10.0 : 5.0;

            double salary;
            if (overTime <= 0) {
                salary = baseSalary;
            } else {
                salary = baseSalary + (overTime * overtimeRate);
            }

            totalSalaries[i] = salary;
        }

        // Print individual salaries
        for (int i = 0; i < totalSalaries.length; i++) {
            System.out.println("Total salary of User " + (i + 1) + ": " + totalSalaries[i]);
        }
    }
}
