import java.util.Scanner;

class StudentMarks {
    private int[] marks = new int[5];
    public void readMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks of 5 students:");
        for (int i = 0; i < 5; i++) {
            marks[i] = scanner.nextInt();
        }
    }
    
    public void findHighestMark() {
        int highest = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > highest) {
                highest = marks[i];
            }
        }
        System.out.println("Highest Mark = " + highest);
    }

    public void findAverageMark() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        double average = (double) sum / marks.length;
        System.out.println("Average Mark = " + average);
    }
    
    public void countPassedStudents() {
        int count = 0;
        for (int mark : marks) {
            if (mark >= 50) {
                count++;
            }
        }
        System.out.println("Number of Passed Students = " + count);
    }
}

public class Mainn {
    public static void main(String[] args) {
        StudentMarks analyzer = new StudentMarks();
        analyzer.readMarks();
        analyzer.findHighestMark();
        analyzer.findAverageMark();
        analyzer.countPassedStudents();
    }
}
