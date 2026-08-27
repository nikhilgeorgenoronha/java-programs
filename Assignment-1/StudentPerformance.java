import java.util.Scanner;

public class StudentPerformance {

    static void displayReport(int m1, int m2, int m3) {

        int highest = Math.max(m1, Math.max(m2, m3));
        int lowest = Math.min(m1, Math.min(m2, m3));

        double average = (m1 + m2 + m3) / 3.0;

        System.out.println("\n------ Student Report ------");
        System.out.println("Subject 1 Marks : " + m1);
        System.out.println("Subject 2 Marks : " + m2);
        System.out.println("Subject 3 Marks : " + m3);
        System.out.println("Highest Marks   : " + highest);
        System.out.println("Lowest Marks    : " + lowest);
        System.out.println("Average Marks   : " + average);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks in Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks in Subject 3: ");
        int m3 = sc.nextInt();

        displayReport(m1, m2, m3);

        sc.close();
    }
}