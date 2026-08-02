import java.util.Scanner;

class EmployeePayroll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        Integer empId = Integer.valueOf(scanner.nextLine());

        System.out.print("Enter Basic Salary: ");
        Double basicSalary = Double.valueOf(scanner.nextLine());

        System.out.print("Enter Bonus Amount: ");
        Double bonus = Double.valueOf(scanner.nextLine());

        if (basicSalary <= 0 || bonus < 0) {
            System.out.println("Invalid input: Basic salary must be greater than zero and bonus cannot be negative.");
        } else {
            double netSalary = basicSalary + bonus;
            System.out.println("\n--- Payroll Details ---");
            System.out.println("Employee ID: " + empId);
            System.out.println("Net Salary: $" + netSalary);
        }

        scanner.close();
    }
}