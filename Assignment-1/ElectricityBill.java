import java.util.Scanner;

public class ElectricityBill {

    static void calculateBill(int units) {

        double bill;

        if (units <= 100) {
            bill = units * 2;
        }
        else if (units <= 200) {
            bill = (100 * 2) + ((units - 100) * 3);
        }
        else {
            bill = (100 * 2) + (100 * 3) + ((units - 200) * 5);
        }

        System.out.println("Total Electricity Bill = ₹" + bill);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();

        calculateBill(units);

        sc.close();
    }
}