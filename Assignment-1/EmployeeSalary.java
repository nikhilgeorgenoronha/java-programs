import java.util.Scanner;

public class EmployeeSalary {

    static double calculateSalary(double basicSalary) {

        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.15;
        double pf = basicSalary * 0.10;

        double netSalary = basicSalary + hra + da - pf;

        return netSalary;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        double salary = calculateSalary(basicSalary);

        System.out.println("Net Salary = ₹" + salary);

        sc.close();
    }
}