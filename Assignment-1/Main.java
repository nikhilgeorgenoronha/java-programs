import java.util.Scanner;

class Chitti
{
    int batteryLevel;
    boolean emotionChip;
    boolean safetyMode;

    int totalTasks = 0;
    int tasksPerformed = 0;
    int tasksRefused = 0;

    Chitti(int batteryLevel, boolean emotionChip, boolean safetyMode)
    {
        this.batteryLevel = batteryLevel;
        this.emotionChip = emotionChip;
        this.safetyMode = safetyMode;
    }

    void displayDetails()
    {
        System.out.println("------ CHITTI DETAILS ------");
        System.out.println("Battery Level : " + batteryLevel + "%");
        System.out.println("Emotion Chip : " + emotionChip);
        System.out.println("Safety Mode : " + safetyMode);
        System.out.println();
    }

    void performTask(String taskName, String taskType, int batteryRequired, boolean harmful)
    {
        totalTasks++;

        System.out.println("Task : " + taskName);

        if(safetyMode && harmful)
        {
            System.out.println("Task Refused!");
            System.out.println("Reason : Safety mode is active. Cannot harm humans.");
            tasksRefused++;
            System.out.println("Battery Remaining : " + batteryLevel + "%");
        }
        else if(batteryLevel < batteryRequired)
        {
            System.out.println("Battery is insufficient.");
            System.out.println("Please charge me.");
            tasksRefused++;
            System.out.println("Battery Remaining : " + batteryLevel + "%");
        }
        else
        {
            if(emotionChip && taskType.equalsIgnoreCase("Rescue"))
            {
                System.out.println("Emotion Chip Activated!");
                System.out.println("I will protect humans.");
            }

            System.out.println("Task Performed Successfully.");
            batteryLevel = batteryLevel - batteryRequired;
            tasksPerformed++;

            System.out.println("Updated Battery : " + batteryLevel + "%");
        }

        System.out.println("--------------------------------");
    }

    void finalReport()
    {
        System.out.println("\n------ FINAL STATUS REPORT ------");
        System.out.println("Total Tasks Attempted : " + totalTasks);
        System.out.println("Tasks Performed : " + tasksPerformed);
        System.out.println("Tasks Refused : " + tasksRefused);
        System.out.println("Final Battery Level : " + batteryLevel + "%");
    }
}

public class Main
{
    public static void main(String args[])
    {
        Chitti robot = new Chitti(70, true, true);

        robot.displayDetails();

        robot.performTask("Speak to audience", "Simple", 10, false);

        robot.performTask("Rescue a student", "Rescue", 30, false);

        robot.performTask("Attack a person", "Security", 20, true);

        robot.performTask("Lift a damaged vehicle", "Rescue", 80, false);

        robot.finalReport();
    }
}
