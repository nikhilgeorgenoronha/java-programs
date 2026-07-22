import java.util.Scanner;

class StudentMarks {
    private int[][] marks;
    public void createArray(int students, int subjects) {
        marks = new int[students][subjects];
    }

    public void readMarks() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < marks[i].length; j++) {
                marks[i][j] = scanner.nextInt();
            }
        }
    }
    public void displayMarks() {
        System.out.println("\nStudent Marks");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Student " + (i + 1) + " : ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void findStudentTotal(int studentNo) {
        int index = studentNo - 1; // Adjusting 1-based user input to 0-based index
        int total = 0;
        for (int j = 0; j < marks[index].length; j++) {
            total += marks[index][j];
        }
        System.out.println("Total Marks of Student " + studentNo + " = " + total);
    }
    public void findStudentAverage(int studentNo) {
        int index = studentNo - 1; // Adjusting 1-based user input to 0-based index
        int total = 0;
        for (int j = 0; j < marks[index].length; j++) {
            total += marks[index][j];
        }
        double average = (double) total / marks[index].length;
        System.out.println("Average Marks of Student " + studentNo + " = " + average);
    }
    public void findHighestMark() {
        int highest = marks[0][0];
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                if (marks[i][j] > highest) {
                    highest = marks[i][j];
                }
            }
        }
        System.out.println("Highest Mark = " + highest);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int students = scanner.nextInt();
        System.out.print("Enter the number of subjects: ");
        int subjects = scanner.nextInt();
        StudentMarks tracker = new StudentMarks();
        tracker.createArray(students, subjects);
        tracker.readMarks();
        tracker.displayMarks();
        System.out.print("Enter the student number: ");
        int studentNo = scanner.nextInt();
        tracker.findStudentTotal(studentNo);
        tracker.findStudentAverage(studentNo);
        tracker.findHighestMark();
    }
}
